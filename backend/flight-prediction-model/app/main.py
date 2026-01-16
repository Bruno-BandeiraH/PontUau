"""
Entry point da aplicação FastAPI.
"""
import logging
from fastapi import FastAPI

from app.api.routes import router

# Configurar logging básico
logging.basicConfig(
    level=logging.INFO,
    format="%(asctime)s - %(name)s - %(levelname)s - %(message)s"
)

# Criar instância FastAPI
app = FastAPI(title="Flight Delay Prediction API")

# Incluir router
app.include_router(router)

