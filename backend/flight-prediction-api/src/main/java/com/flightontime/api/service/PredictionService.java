package com.flightontime.api.service;

import com.flightontime.api.dto.PredictionRequestDTO;
import com.flightontime.api.dto.PredictionResponseDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class PredictionService {

    private final WebClient predictionWebClient;


    public PredictionService(WebClient predictionWebClient) {
        this.predictionWebClient = predictionWebClient;
    }

    public PredictionResponseDTO predict(PredictionRequestDTO request) {
        return predictionWebClient.post()
            .uri("/predict")
            .bodyValue(request)
            .retrieve()
            .bodyToMono(PredictionResponseDTO.class)
            .block();
    }
}
