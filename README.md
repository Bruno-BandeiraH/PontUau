
# 🛫 PontUau - Previsão Inteligente de Atraso de Voos

PontUau é um sistema de previsão de atrasos de voos baseado em Machine Learning, desenvolvido pela equipe Araras Selvagens durante o Hackathon promovido pela Alura em parceria com a No Country.

O projeto utiliza modelos de classificação binária treinados com dados históricos reais de voos nacionais para determinar se um voo será Pontual ou Atrasado, fornecendo a probabilidade estimada da previsão e contando com recursos de análise de banco de dados.

## Objetivos Principais
- Prever atrasos de voos com antecedência
- Identificar padrões de pontualidade por companhia aérea
- Analisar estatísticas históricas de rotas específicas
- Fornecer insights para melhoria operacional

## Endpoints
![endpoints](./flight-prediction-api/src/main/resources/static/img/endpoints.jpeg)

## Funcionalidades
- Prever - Indicar se um voo chegará no horário ou atrasado.
- Estatísticas - Mostrar quantas previsões foram feitas e quantas resultaram em atrasos ou voos pontuais.
- Companhias Aéreas - Mostrar a companhia aérea com o maior número de previsões de voos pontuais ou atrasados, por ano ou desde o início.
- Rotas - Exibir a rota com o maior número de previsões de atrasos ou voos pontuais.

### Requisitos para rodar
- Docker 29.1.2 or +.
### Requisitos para desenvolver
- Java 21 or +;
- Python 3.12.10 or +;
- Maven;

## Como Usar:
- Abra o terminal na raiz do projeto
- Digite o comando: ```docker-compose up --build``` e o sistema vai estar no ar (Portas - Spring:```8081```, MySQL:```3307```, fastAPI:```5000```)
- Abra seu navegador e digite ```http://localhost:8080/swagger-ui.html``` para testar os endpoints



## Exemplo de requisição POST no endpoint /predict
A variável ```previsao_atraso``` retorna 0 (pontual) ou 1 (atrasado).

Requisição: 
```JSON
{
  "icao_empresa": "AZU",  
  "icao_aerodromo_origem": "SBRF", 
  "icao_aerodromo_destino": "SBRJ", 
  "partida_prevista": "2025-11-12T22:30:00",  
  "tempo_voo_estimado_hr": 1.2,  
  "distancia_km": 50.0  
}
```

Resposta: 
```JSON
{
    "previsao_atraso": 0, 
    "probabilidade_atraso": 0.29
}
```

## Estrutura do projeto
```
PontUau/
├── flight-prediction-api/  # API Principal
├── flight-prediction-model/  # fastAPI com o modelo implementado
├── README.md
└── docker-compose.yml
```

#### flight-prediction-api
```
flight-prediction-api/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │       ├── flightontime/
│   │   │           ├── api/
│   │   │               ├── config/
│   │   │               │   ├── CorsConfig.java
│   │   │               │   └── WebClientConfig.java
│   │   │               ├── controller/
│   │   │               │   ├── FlightController.java
│   │   │               │   └── PredictionController.java
│   │   │               ├── domain/
│   │   │               │   ├── Flight.java
│   │   │               │   └── FlightRepository.java
│   │   │               ├── dto/
│   │   │               │   ├── AirlineDelayedData.java
│   │   │               │   ├── AirlineOnTimeData.java
│   │   │               │   ├── FlightDTO.java
│   │   │               │   ├── PredictionRequestDTO.java
│   │   │               │   ├── PredictionResponseDTO.java
│   │   │               │   ├── RouteDelayedData.java
│   │   │               │   ├── RouteOnTimeData.java
│   │   │               │   ├── StatisticsByYearData.java
│   │   │               │   └── StatisticsData.java
│   │   │               ├── infra/
│   │   │               │   ├── exception/
│   │   │               │   │   ├── ResourceNotFoundException.java
│   │   │               │   │   └── RestExceptionHandler.java
│   │   │               │   ├── validations/
│   │   │               │   │   ├── time/
│   │   │               │   │   │   └── ExpectedTime.java
│   │   │               │   │   └── RepositoryValidator.java
│   │   │               │   └── ValidatorException.java
│   │   │               ├── service/
│   │   │               │   ├── FlightService.java
│   │   │               │   └── PredictionService.java
│   │   │               └── FlightPredictionApiApplication.java
│   │   ├── resources/
│   │       ├── static/
│   │       │   ├── img/
│   │       │       └── endpoint.png
│   │       ├── templates/
│   │       └── application.properties
│   ├── test/
│       ├── java/
│           ├── com/
│               ├── flightontime/
│                   ├── api/
│                       ├── controller/
│                       │   └── PredictionControllerTest.java
│                       ├── domain/
│                       │   └── FlightTest.java
│                       ├── infra/
│                       │   ├── validations/
│                       │       ├── time/
│                       │           └── ExpectedTimeTest.java
│                       ├── service/
│                       │   └── PredictionServiceTest.java
│                       └── FlightPredictionApiApplicationTests.java
├── Dockerfile
├── README.md
├── mvnw
├── mvnw.cmd
└── pom.xml
```

#### flight-prediction-model
```
flight-prediction-model/
├── app/
│   ├── api/
│   │   ├── __init__.py
│   │   └── routes.py
│   ├── config/
│   │   ├── __init__.py
│   │   └── settings.py
│   ├── models/
│   │   ├── __init__.py
│   │   └── schemas.py
│   ├── services/
│   │   ├── __init__.py
│   │   ├── feature_engineering.py
│   │   └── prediction_service.py
│   ├── __init__.py
│   └── main.py
├── model/
│   └── modelo_previsao_atraso_voos_v2.pkl
├── Dockerfile
├── README.md
└── requirements.txt
```

## Araras Selvagens

### Backend

<table align="center">
  <tr>
    <td align="center">
      <a href="https://github.com/Bruno-BandeiraH">
        <img src="https://github.com/Bruno-BandeiraH.png" width="150px;" alt="Foto de Bruno Bandeira"/><br>
        <sub><b>Bruno Bandeira</b></sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/Rafael-LynX">
        <img src="https://github.com/Rafael-LynX.png" width="150px;" alt="Foto de Rafael Vieira"/><br>
        <sub><b>Rafael Vieira</b></sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/RichardFFreitas">
        <img src="https://github.com/RichardFFreitas.png" width="150px;" alt="Foto de Richard Freitas"/><br>
        <sub><b>Richard Freitas</b></sub>
      </a>
    </td>
  </tr>
</table>

### Data Science

<table align="center">
  <tr>
    <td align="center">
      <a href="https://github.com/gabriel-schineider">
        <img src="https://github.com/gabriel-schineider.png" width="150px;" alt="Foto de Gabriel Schineider"/><br>
        <sub><b>Gabriel Schineider</b></sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/GleiceAraujo22">
        <img src="https://github.com/GleiceAraujo22.png" width="150px;" alt="Foto de Gleice Araújo"/><br>
        <sub><b>Gleice Araújo</b></sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/WellingtonGabriel20">
        <img src="https://github.com/WellingtonGabriel20.png" width="150px;" alt="Foto de Richard Freitas"/><br>
        <sub><b>Wellington Silva</b></sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/realcsilveira">
        <img src="https://github.com/realcsilveira.png" width="150px;" alt="Foto de Cristiano Silveira"/><br>
        <sub><b>Cristiano Silveira</b></sub>
      </a>
    </td>
  </tr>
</table>

### Repositórios anteriores:
- [API Principal](https://github.com/Bruno-BandeiraH/flight-on-time-api)
- [API integrando o modelo de ML](https://github.com/Bruno-BandeiraH/flight-prediction-model/)
- [Data Science](https://github.com/gabriel-schineider/flight-on-time-API-Data_Science_Team/)


## Tecnologias

### Backend
- Frameworks: Spring Boot, fastAPI
- Lingaigens: Java, Python
- Banco de dados: MySQL
- Documentação: SpringDoc
- Testes: JUnit 5, Mockito
- Versionamento: Git, GitHub
- Build: Maven

### Data Science
- Python
- Pandas
- scikit-learn
- Jupyter Notebook
- Modelagem supervisionada
