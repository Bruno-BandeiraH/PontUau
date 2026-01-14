
# PontUau

PontUau is a flight punctuality prediction system that uses machine learning and statistical analysis to predict whether a flight will be delayed or not.

## Main goals
- Predict flight delays in advance 
- Identify ponctuality patterns by airline
- Analyse historical statistics of specifics routes
- Provide insights for operational improvement

## Endpoints
![endpoints](./flight-prediction-api/src/main/resources/static/img/endpoints.jpeg)

## Functionalities
- Predict - Tells if a flight is gonna be on time or delayed.
- Statistics - Show how many predictions were made, and how much were delayed or on time.
- Airlines - Show the Airline with most prediction flights on time or delayed, by year or from all time.
- Routes - Bring the route with most delayed or on time predictions. 

### Requirements for running
- Docker 29.1.2 or +.
### Requirements for developing
- Java 21 or +;
- Python 3.12.10 or +;
- Maven;

## How to use:
- Open the terminal on the root of the project
- Enter the command: ```docker-compose up --build```
- Open your browser and type ```http://localhost:8080/swagger-ui.html```

## Project Structure
```
PontUau/
├── flight-prediction-api/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   ├── com/
│   │   │   │       ├── flightontime/
│   │   │   │           ├── api/
│   │   │   │               ├── config/
│   │   │   │               │   ├── CorsConfig.java
│   │   │   │               │   └── WebClientConfig.java
│   │   │   │               ├── controller/
│   │   │   │               │   ├── FlightController.java
│   │   │   │               │   └── PredictionController.java
│   │   │   │               ├── domain/
│   │   │   │               │   ├── Flight.java
│   │   │   │               │   └── FlightRepository.java
│   │   │   │               ├── dto/
│   │   │   │               │   ├── AirlineDelayedData.java
│   │   │   │               │   ├── AirlineOnTimeData.java
│   │   │   │               │   ├── FlightDTO.java
│   │   │   │               │   ├── PredictionRequestDTO.java
│   │   │   │               │   ├── PredictionResponseDTO.java
│   │   │   │               │   ├── RouteDelayedData.java
│   │   │   │               │   ├── RouteOnTimeData.java
│   │   │   │               │   ├── StatisticsByYearData.java
│   │   │   │               │   └── StatisticsData.java
│   │   │   │               ├── infra/
│   │   │   │               │   ├── exception/
│   │   │   │               │   │   ├── ResourceNotFoundException.java
│   │   │   │               │   │   └── RestExceptionHandler.java
│   │   │   │               │   ├── validations/
│   │   │   │               │   │   ├── time/
│   │   │   │               │   │   │   └── ExpectedTime.java
│   │   │   │               │   │   └── RepositoryValidator.java
│   │   │   │               │   └── ValidatorException.java
│   │   │   │               ├── service/
│   │   │   │               │   ├── FlightService.java
│   │   │   │               │   └── PredictionService.java
│   │   │   │               └── FlightPredictionApiApplication.java
│   │   │   ├── resources/
│   │   │       ├── static/
│   │   │       │   ├── img/
│   │   │       │       └── endpoints.jpeg
│   │   │       ├── templates/
│   │   │       └── application.properties
│   │   ├── test/
│   │       ├── java/
│   │           ├── com/
│   │               ├── flightontime/
│   │                   ├── api/
│   │                       ├── controller/
│   │                       │   └── PredictionControllerTest.java
│   │                       ├── domain/
│   │                       │   └── FlightTest.java
│   │                       ├── infra/
│   │                       │   ├── validations/
│   │                       │       ├── time/
│   │                       │           └── ExpectedTimeTest.java
│   │                       ├── service/
│   │                       │   └── PredictionServiceTest.java
│   │                       └── FlightPredictionApiApplicationTests.java
│   ├── Dockerfile
│   ├── README.md
│   └── pom.xml
├── flight-prediction-model/
│   ├── app/
│   │   ├── api/
│   │   │   ├── __init__.py
│   │   │   └── routes.py
│   │   ├── config/
│   │   │   ├── __init__.py
│   │   │   └── settings.py
│   │   ├── models/
│   │   │   ├── __init__.py
│   │   │   └── schemas.py
│   │   ├── services/
│   │   │   ├── __init__.py
│   │   │   ├── feature_engineering.py
│   │   │   └── prediction_service.py
│   │   ├── __init__.py
│   │   └── main.py
│   ├── model/
│   │   └── modelo_previsao_atraso_voos_v2.pkl
│   ├── Dockerfile
│   ├── README.md
│   └── requirements.txt
├── README.md
└── docker-compose.yml
```

## Development Team

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
      <a href="https://github.com/Cristiano">
        <img src="https://github.com/RichardFFreitas.png" width="150px;" alt="Foto de Cristiano Silveira"/><br>
        <sub><b>Cristiano Silveira</b></sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/arley">
        <img src="https://github.com/RichardFFreitas.png" width="150px;" alt="Foto de Arley Ribeiro"/><br>
        <sub><b>Arley Ribeiro</b></sub>
      </a>
    </td>
  </tr>
</table>

## Technologies
- Backend: Spring Boot 4, fastAPI
- Language: Java 21
- Database: MySQL 8+
- Documentation: SpringDoc
- Tests: JUnit 5, Mockito
- Versioning: Git, GitHub
- Build: Maven
