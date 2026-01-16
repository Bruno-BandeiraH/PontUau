# API DO MODELO DE PREVISÃO DE VOOS

Modelo de previsão de voos criado pelo time de data science para ser implementado a API do projeto.

## Estrutura do Projeto

```
flight-prediction-model/
├── app/
│   ├── main.py                    # Entry point FastAPI
│   ├── api/
│   │   └── routes.py              # Endpoints da API
│   ├── models/
│   │   └── schemas.py             # Schemas Pydantic
│   ├── services/
│   │   ├── feature_engineering.py # Feature engineering
│   │   └── prediction_service.py  # Serviço de predição
│   └── config/
│       └── settings.py            # Configurações
├── model/                         # Modelo ML serializado
├── tests/                         # Testes (estrutura preparada)
├── scripts/                       # Scripts utilitários
└── logs/                          # Logs da aplicação
```

## Requisitos
- Docker 29.1.2 ou +.

## Como usar

### Com Docker (Recomendado)
- Baixe o repositório na sua máquina.
- Abra o terminal na pasta do repositório e crie a imagem do serviço com o comando: ```docker build -t flight-prediction-model .```
- Rode o container com o comando: ```docker run -p 8000:8000 flight-prediction-model```
- API disponível em http://localhost:8000/predict
- Swagger: http://localhost:8000/docs

### Desenvolvimento Local
- Instale as dependências: `pip install -r requirements.txt`
- Execute a API: `uvicorn app.main:app --host 0.0.0.0 --port 8000`


## Exemplo de requisição POST no endpoint /predict

Requisição: 
```JSON
{
  "icao_empresa_aerea": "AZ",
  "icao_aerodromo_origem": "SBGR",
  "icao_aerodromo_destino": "SBRJ",
  "hora_prevista": "2025-11-12T22:30:00",
  "voos_no_slot": 18,
  "tempo_voo_estimado": 55
}
```

Resposta: 
```JSON
{
    "previsao": "Pontual",
    "probabilidade": 0.296,
    "threshold_usado": 0.5
}
```
