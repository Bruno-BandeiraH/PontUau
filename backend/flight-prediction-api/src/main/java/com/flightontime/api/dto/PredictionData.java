package com.flightontime.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "DTO com valores numéricos para persistência")
public record PredictionData(

    @JsonProperty("previsao_atraso")
    String prediction,

    @JsonProperty("probabilidade_atraso")
    String probability
) {

    public PredictionData(Integer prediction, Float probability) {
        this(
            formatPrediction(prediction),
            formatProbability(probability)
        );
    }

    private static String formatPrediction(Integer prediction) {
        if (prediction == null) return "Indeterminado";
        return prediction == 1 ? "Atrasado" : "Pontual";
    }

    private static String formatProbability(Float probability) {
        if (probability == null) return "0%";
        return String.format("%.1f%%", probability * 100);
    }
}