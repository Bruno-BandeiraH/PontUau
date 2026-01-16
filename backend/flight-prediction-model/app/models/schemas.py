"""
Schemas Pydantic para validação de dados.
"""
from pydantic import BaseModel
from datetime import datetime


class FlightRequest(BaseModel):
    """Schema para requisição de predição de voo."""
    icao_empresa: str
    icao_aerodromo_origem: str
    icao_aerodromo_destino: str
    partida_prevista: datetime
    tempo_voo_estimado_hr: float
    distancia_km: float


class PredictionResponse(BaseModel):
    """Schema para resposta de predição."""
    previsao_atraso: int
    probabilidade_atraso: float


class HealthResponse(BaseModel):
    """Schema para resposta de health check."""
    status: str
    model_loaded: bool

