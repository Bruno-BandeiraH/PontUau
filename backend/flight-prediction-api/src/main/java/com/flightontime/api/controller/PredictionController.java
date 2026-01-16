package com.flightontime.api.controller;

import com.flightontime.api.dto.FlightDTO;
import com.flightontime.api.dto.PredictionData;
import com.flightontime.api.dto.PredictionRequestDTO;
import com.flightontime.api.dto.PredictionResponseDTO;
import com.flightontime.api.infra.validations.RepositoryValidator;
import com.flightontime.api.service.FlightService;
import com.flightontime.api.service.PredictionService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PredictionController {

    private final PredictionService predictionService;
    private final FlightService flightService;
    private final List<RepositoryValidator> validators;

    public PredictionController(PredictionService predictionService, FlightService flightService, List<RepositoryValidator> validators) {
        this.predictionService = predictionService;
        this.flightService = flightService;
        this.validators = validators;
    }

    @PostMapping("/predict")
    public ResponseEntity<PredictionData> getPrediction(@RequestBody @Valid PredictionRequestDTO requestData) {
        validators.forEach(v -> v.validator(requestData));
        PredictionResponseDTO response = predictionService.predict(requestData);
        PredictionData data = response.toPredictionData();
        flightService.save(new FlightDTO(requestData, response));
        return ResponseEntity.ok(data);
    }
}
