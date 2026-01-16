package com.flightontime.api.controller;

import com.flightontime.api.dto.PredictionResponseDTO;
import com.flightontime.api.infra.ValidatorException;
import com.flightontime.api.infra.validations.RepositoryValidator;
import com.flightontime.api.service.PredictionService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(PredictionController.class)
@Import(com.flightontime.api.infra.exception.RestExceptionHandler.class)
class PredictionControllerTest {

    @Autowired
    private MockMvc mvc;
    @MockitoBean
    private PredictionService predictionService;
    @MockitoBean
    private List<RepositoryValidator> validators;

    @Test
    void shouldReturn200WhenRequestIsValid() throws Exception {
        when(predictionService.predict(any()))
            .thenReturn(buildResponse());

        mvc.perform(post("/predict")
                .contentType(MediaType.APPLICATION_JSON)
                .content(validRequest()))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.previsao_atraso").value(0))
            .andExpect(jsonPath("$.probabilidade_atraso").value(0.82));
    }

    @Test
    void shouldReturn400WhenBeanValidationFails() throws Exception {
        var invalidRequest = """
            {
              "icao_empresa": "",
              "icao_aerodromo_origem": "SBGR",
              "icao_aerodromo_destino": "SBRJ",
              "partida_prevista": "2025-11-12T22:30:00",
              "distancia_km": 55
              "tempo_voo_estimado_hr": 3
            }
            """;

        mvc.perform(post("/predict")
                .contentType(MediaType.APPLICATION_JSON)
                .content(invalidRequest))
            .andExpect(status().isBadRequest());
    }

    @Test
    void shouldReturn400WhenCustomValidatorFails() throws Exception {
        Mockito.doThrow(new ValidatorException("icao_empresa", "Inválido"))
            .when(validators)
            .forEach(any());

        mvc.perform(post("/predict")
                .contentType(MediaType.APPLICATION_JSON)
                .content(validRequest()))
            .andExpect(status().isBadRequest());
    }

    @Test
    void shouldReturn400WhenJsonIsMalformed() throws Exception {
        mvc.perform(post("/predict")
                .contentType(MediaType.APPLICATION_JSON)
                .content("invalid JSON"))
            .andExpect(status().isBadRequest());
    }

    @Test
    void shouldReturn500WhenServiceThrowsException() throws Exception {
        Mockito.when(predictionService.predict(any()))
            .thenThrow(new RuntimeException("internal_error"));

        mvc.perform(post("/predict")
                .contentType(MediaType.APPLICATION_JSON)
                .content(validRequest()))
            .andExpect(status().isInternalServerError());
    }

    private PredictionResponseDTO buildResponse() {
        return new PredictionResponseDTO(
            0,
            0.82f
        );
    }

    private String validRequest() {
        return """
            {
              "icao_empresa": "AZU",
              "icao_aerodromo_origem": "SBGR",
              "icao_aerodromo_destino": "SBRJ",
              "partida_prevista": "2025-11-12T22:30:00",
              "distancia_km": 120,
              "tempo_voo_estimado_hr": 5
            }
            """;
    }
}