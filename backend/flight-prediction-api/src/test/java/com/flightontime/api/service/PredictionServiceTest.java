package com.flightontime.api.service;

import com.flightontime.api.dto.PredictionRequestDTO;
import com.flightontime.api.dto.PredictionResponseDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PredictionServiceTest {

    @Mock
    private WebClient predictionWebClient;
    @Mock
    private WebClient.RequestBodyUriSpec requestBodyUriSpec;
    @Mock
    private WebClient.RequestBodySpec requestBodySpec;
    @Mock
    private WebClient.RequestHeadersSpec requestHeadersSpec;
    @Mock
    private WebClient.ResponseSpec responseSpec;
    @InjectMocks
    private PredictionService service;

    @BeforeEach
    void setup() {
        when(predictionWebClient.post()).thenReturn(requestBodyUriSpec);
        when(requestBodyUriSpec.uri("/predict")).thenReturn(requestBodySpec);
        when(requestBodySpec.bodyValue(any())).thenReturn(requestHeadersSpec);
        when(requestHeadersSpec.retrieve()).thenReturn(responseSpec);
    }

    @Test
    void shouldReturnPredictionWhenApiRespondsSuccessfully() {
        var expectedResponse = new PredictionResponseDTO(1, 0.82F);

        when(responseSpec.bodyToMono(PredictionResponseDTO.class))
            .thenReturn(Mono.just(expectedResponse));

        var response = service.predict(buildValidRequest());

        assertNotNull(response);
        assertEquals(1, response.prediction());
        assertEquals(0.82F, response.probability());
    }

    @Test
    void shouldMapResponseCorrectly() {
        var expectedResponse = new PredictionResponseDTO(0, 0.15F);

        when(responseSpec.bodyToMono(PredictionResponseDTO.class))
            .thenReturn(Mono.just(expectedResponse));

        var response = service.predict(buildValidRequest());

        assertEquals(0, response.prediction());
        assertEquals(0.15F, response.probability());
    }

    @Test
    void shouldSendCorrectDataToApi() {
        when(responseSpec.bodyToMono(PredictionResponseDTO.class))
            .thenReturn(Mono.just(new PredictionResponseDTO(0, 0.10F)));

        var request = buildValidRequest();

        service.predict(request);

        verify(requestBodySpec).bodyValue(request);
    }

    @Test
    void shouldThrowExceptionWhenApiReturns4xx() {
        when(responseSpec.bodyToMono(PredictionResponseDTO.class))
            .thenThrow(WebClientResponseException.BadRequest.create(
                400, "Bad Request", null, null, null));

        assertThrows(WebClientResponseException.class,
            () -> service.predict(buildValidRequest()));
    }

    @Test
    void shouldThrowExceptionWhenApiReturns5xx() {
        when(responseSpec.bodyToMono(PredictionResponseDTO.class))
            .thenThrow(WebClientResponseException.InternalServerError.create(
                500, "Internal Error", null, null, null));

        assertThrows(
            WebClientResponseException.class,
            () -> service.predict(buildValidRequest()));
    }

    @Test
    void shouldReturnNullWhenApiReturnsNullPayload() {
        when(responseSpec.bodyToMono(PredictionResponseDTO.class))
            .thenReturn(Mono.empty());

        var response = service.predict(buildValidRequest());

        assertNull(response);
    }

    @Test
    void shouldReturnResponseWithNullFieldWhenApiReturnsNullMandatoryField() {
        var responseWithNull =
            new PredictionResponseDTO(null, 0.5F);

        when(responseSpec.bodyToMono(PredictionResponseDTO.class))
            .thenReturn(Mono.just(responseWithNull));

        var response = service.predict(buildValidRequest());

        assertNotNull(response);
        assertNull(response.prediction());
        assertEquals(0.5F, response.probability());
    }

    private PredictionRequestDTO buildValidRequest() {
        return new PredictionRequestDTO(
            "AZ",
            "SBGR",
            "SBRJ",
            LocalDateTime.now().plusDays(1),
            120F,
            3F
        );
    }
}