"""
Serviço de predição de atrasos de voos.
"""
import logging
import joblib
from pathlib import Path

from app.config.settings import MODEL_PATH
from app.models.schemas import FlightRequest, PredictionResponse
from app.services.feature_engineering import gerar_features

logger = logging.getLogger(__name__)


class PredictionService:
    """Serviço para gerenciar modelo ML e fazer predições."""
    
    def __init__(self, model_path: Path = None):
        """
        Inicializa o serviço carregando o modelo.
        
        Args:
            model_path: Caminho para o arquivo do modelo. Se None, usa MODEL_PATH padrão.
        """
        if model_path is None:
            model_path = MODEL_PATH
        
        self.model_path = model_path
        self.model = None
        self.threshold = None
        self.feature_order = None
        
        self._load_model()
    
    def _load_model(self):
        """Carrega e valida o modelo ML."""
        logger.info(f"Carregando modelo depipe_xgb_te: {self.model_path}")
        
        # Converter Path para string para compatibilidade com joblib
        model_path_str = str(self.model_path)
        artifacts = joblib.load(model_path_str)
        
        # Validação defensiva do artefato
        if not isinstance(artifacts, dict):
            raise RuntimeError("Artefato do modelo inválido: esperado um dict.")
        
        required_keys = {"model", "feature_order"}
        missing = required_keys - artifacts.keys()
        if missing:
            raise RuntimeError(f"Artefato do modelo incompleto. Faltando: {missing}")
        
        self.model = artifacts["model"]
        self.threshold = artifacts.get("threshold_recomendado", 0.45)
        self.feature_order = artifacts.get("feature_order")
        
        logger.info(f"Modelo carregado com sucesso. Tipo: {type(artifacts)}")
        logger.info(f"Chaves do artefato: {list(artifacts.keys())}")
    
    def predict(self, request: FlightRequest) -> PredictionResponse:
        """
        Faz predição de atraso para um voo.
        
        Args:
            request: Dados do voo para predição
            
        Returns:
            PredictionResponse com resultado da predição
        """
        # Geração das features
        df = gerar_features(request.dict(), self.feature_order)
        
        # Predição
        prob = self.model.predict_proba(df)[0][1]
        previsao = 1 if prob >= self.threshold else 0
        
        return PredictionResponse(
            previsao_atraso=previsao,
            probabilidade_atraso=round(float(prob), 2),
            #threshold_usado=self.threshold
        )

