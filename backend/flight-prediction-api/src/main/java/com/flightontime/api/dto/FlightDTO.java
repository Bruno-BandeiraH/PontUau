package com.flightontime.api.dto;

import jakarta.validation.Valid;

import java.time.LocalDateTime;

public record FlightDTO(
    String icaoAirline,
    String icaoOrigin,
    String icaoDestination,
    LocalDateTime expectedTime,
    Float estimatedFlightTime,
    Float distance,
    int prediction,
    float probability

) {
    public FlightDTO(@Valid PredictionRequestDTO requestData, PredictionResponseDTO response) {
        this(
            requestData.icaoAirline(),
            requestData.icaoOrigin(),
            requestData.icaoDestination(),
            requestData.expectedTime(),
            requestData.estimatedFlightTime(),
            requestData.distance(),
            response.prediction(),
            response.probability());
    }
}
