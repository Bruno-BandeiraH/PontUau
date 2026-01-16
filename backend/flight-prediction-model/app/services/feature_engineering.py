"""
Feature Engineering para transformação de dados.
"""
import pandas as pd


def gerar_features(data: dict, features_esperadas: list) -> pd.DataFrame:
    """
    Gera features a partir dos dados brutos do voo.
    
    Args:
        data: Dicionário com dados do voo
        features_esperadas: Lista com ordem esperada das features
        
    Returns:
        DataFrame pandas com features processadas
    """
    df = pd.DataFrame([data])

    # Hora fracionada (ex: 14.5 = 14:30)
    df["tempo_estimado_voo_hr"] = (
        df["partida_prevista"].dt.hour +
        df["partida_prevista"].dt.minute / 60
    )

    # Faixa horária (exemplo simples)
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

    # Fim de semana
    # df["eh_fim_de_semana"] = df["partida_prevista"].dt.weekday >= 5

    # Mês do voo
    df["mes"] = df["partida_prevista"].dt.month

    # Remover coluna original
    df = df.drop(columns=["partida_prevista"])

    # Garantir ordem e presença das features
    df = df[features_esperadas]

    return df

