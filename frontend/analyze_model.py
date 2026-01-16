import joblib
import json
import pandas as pd
import numpy as np
from datetime import datetime, timedelta

# Carregar o modelo
print("Carregando modelo...")
model_data = joblib.load('flight-prediction-model/model/modelo_previsao_atraso_voos_v2.pkl')

print("\n=== INFORMAÇÕES DO MODELO ===")
print(f"Chaves disponíveis: {list(model_data.keys())}")
print(f"Features esperadas: {model_data.get('feature_order', [])}")
print(f"Threshold recomendado: {model_data.get('threshold_recomendado', 'N/A')}")

# Aeroportos brasileiros principais (ICAO) - TODOS OS 20
aeroportos = {
    'SBGR': 'Guarulhos (GRU)',
    'SBSP': 'Congonhas (CGH)',
    'SBBR': 'Brasília (BSB)',
    'SBGL': 'Galeão (GIG)',
    'SBRJ': 'Santos Dumont (SDU)',
    'SBCF': 'Confins (CNF)',
    'SBPA': 'Porto Alegre (POA)',
    'SBRF': 'Recife (REC)',
    'SBSV': 'Salvador (SSA)',
    'SBCT': 'Curitiba (CWB)',
    'SBFL': 'Florianópolis (FLN)',
    'SBBE': 'Belém (BEL)',
    'SBFZ': 'Fortaleza (FOR)',
    'SBKP': 'Campinas (VCP)',
    'SBMQ': 'Macapá (MCP)',
    'SBMO': 'Maceió (MCZ)',
    'SBNF': 'Navegantes (NVT)',
    'SBNT': 'Natal (NAT)',
    'SBVT': 'Vitória (VIX)',
    'SBEG': 'Manaus (MAO)'
}

# Companhias aéreas brasileiras (ICAO)
companhias = ['GLO', 'AZU', 'TAM', 'ONE']

# Criar dataset de simulações
print("\n=== GERANDO SIMULAÇÕES ===")
simulacoes = []

# Testar diferentes combinações - TODOS OS AEROPORTOS
for origem in aeroportos.keys():
    for destino in aeroportos.keys():
        if origem == destino:
            continue
        
        for hora in range(6, 23, 2):  # Horários das 6h às 22h
            for companhia in companhias:
                # Criar dados de entrada
                data_voo = datetime(2025, 6, 15, hora, 0)  # Junho (meio do ano)
                
                # Estimar distância e tempo (valores aproximados)
                distancia = np.random.uniform(300, 3000)
                tempo_voo = distancia / 800  # ~800 km/h velocidade média
                
                dados = {
                    'icao_empresa': companhia,
                    'icao_aerodromo_origem': origem,
                    'icao_aerodromo_destino': destino,
                    'partida_prevista': data_voo,
                    'tempo_voo_estimado_hr': tempo_voo,
                    'distancia_km': distancia
                }
                
                # Gerar features
                df = pd.DataFrame([dados])
                df["tempo_estimado_voo_hr"] = (
                    df["partida_prevista"].dt.hour +
                    df["partida_prevista"].dt.minute / 60
                )
                
                def turno(h):
                    if 6 <= h < 12:
                        return "manha"
                    elif 12 <= h < 18:
                        return "tarde"
                    elif 18 <= h < 24:
                        return "noite"
                    else:
                        return "madrugada"
                
                df["turno"] = df["partida_prevista"].dt.hour.apply(turno)
                df["mes"] = df["partida_prevista"].dt.month
                df = df.drop(columns=["partida_prevista"])
                
                # Ordenar features
                feature_order = model_data.get('feature_order', [])
                df = df[feature_order]
                
                # Fazer predição
                try:
                    prob = model_data['model'].predict_proba(df)[0][1]
                    threshold = model_data.get('threshold_recomendado', 0.45)
                    previsao = 1 if prob >= threshold else 0
                    
                    simulacoes.append({
                        'origem': origem,
                        'origem_nome': aeroportos[origem],
                        'destino': destino,
                        'destino_nome': aeroportos[destino],
                        'companhia': companhia,
                        'hora': hora,
                        'turno': turno(hora),
                        'probabilidade_atraso': prob,
                        'previsao': 'Atraso' if previsao == 1 else 'Pontual'
                    })
                except Exception as e:
                    print(f"Erro na predição: {e}")
                    continue

# Converter para DataFrame
df_simulacoes = pd.DataFrame(simulacoes)

print(f"\nTotal de simulações: {len(df_simulacoes)}")

# Análises
print("\n=== ANÁLISE: AEROPORTOS MAIS PONTUAIS (ORIGEM) ===")
pontuacao_origem = df_simulacoes.groupby('origem').agg({
    'probabilidade_atraso': 'mean',
    'origem_nome': 'first'
}).sort_values('probabilidade_atraso')

print(pontuacao_origem.head(10))

print("\n=== ANÁLISE: MELHORES HORÁRIOS PARA VOAR ===")
pontuacao_hora = df_simulacoes.groupby('hora').agg({
    'probabilidade_atraso': 'mean'
}).sort_values('probabilidade_atraso')

print(pontuacao_hora)

print("\n=== ANÁLISE: MELHORES TURNOS ===")
pontuacao_turno = df_simulacoes.groupby('turno').agg({
    'probabilidade_atraso': 'mean'
}).sort_values('probabilidade_atraso')

print(pontuacao_turno)

print("\n=== ANÁLISE: COMPANHIAS MAIS PONTUAIS ===")
pontuacao_companhia = df_simulacoes.groupby('companhia').agg({
    'probabilidade_atraso': 'mean'
}).sort_values('probabilidade_atraso')

print(pontuacao_companhia)

# Salvar resultados em JSON
resultados = {
    'aeroportos_pontuais': pontuacao_origem.head(5).to_dict(),
    'melhores_horarios': pontuacao_hora.head(5).to_dict(),
    'melhores_turnos': pontuacao_turno.to_dict(),
    'companhias_pontuais': pontuacao_companhia.to_dict(),
    'total_simulacoes': len(df_simulacoes)
}

with open('insights_modelo.json', 'w', encoding='utf-8') as f:
    json.dump(resultados, f, indent=2, ensure_ascii=False)

print("\n✅ Resultados salvos em 'insights_modelo.json'")
