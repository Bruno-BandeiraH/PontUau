package com.flightontime.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record PredictionResponseDTO(

    @JsonProperty("previsao_atraso") Integer prediction,
    @JsonProperty("probabilidade_atraso") Float probability
) {
    public PredictionData toPredictionData() {
        return new PredictionData(prediction, probability);
    }
}
