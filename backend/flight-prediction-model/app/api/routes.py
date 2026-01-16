"""
Rotas da API FastAPI.
"""
from fastapi import APIRouter, HTTPException

from app.models.schemas import FlightRequest, PredictionResponse, HealthResponse
from app.services.prediction_service import PredictionService

router = APIRouter()

# Instância singleton do serviço de predição
prediction_service = PredictionService()


@router.get("/", response_model=HealthResponse)
def health_check():
    """Endpoint de health check."""
    return HealthResponse(
        status="ok",
        model_loaded=True
    )


@router.post("/predict", response_model=PredictionResponse)
def predict_flight_delay(request: FlightRequest):
    """
    Endpoint para predição de atraso de voo.
    
    Args:
        request: Dados do voo
        
    Returns:
        Predição de atraso com probabilidade
    """
    try:
        return prediction_service.predict(request)
    except Exception as e:
        raise HTTPException(
            status_code=500,
            detail=str(e)
        )

