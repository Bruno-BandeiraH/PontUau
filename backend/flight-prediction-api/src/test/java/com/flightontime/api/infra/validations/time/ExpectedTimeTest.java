package com.flightontime.api.infra.validations.time;

import com.flightontime.api.dto.PredictionRequestDTO;
import com.flightontime.api.infra.ValidatorException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;


class ExpectedTimeTest {

    private ExpectedTime expectedTimeValidator;

    @BeforeEach
    void setUp() {
        expectedTimeValidator = new ExpectedTime();
    }

    @Test
    void shouldNotThrowExceptionWhenExpectedTimeIsWithinOneYear() {
        var request = buildRequest(
            LocalDateTime.now().plusMonths(3)
        );

        assertDoesNotThrow(() ->
            expectedTimeValidator.validator(request)
        );
    }

    @Test
    void shouldThrowValidatorExceptionWhenExpectedTimeIsAfterOneYear() {
        var request = buildRequest(
            LocalDateTime.now().plusYears(1).plusSeconds(1)
        );

        var exception = assertThrows(
            ValidatorException.class,
            () -> expectedTimeValidator.validator(request)
        );

        assertEquals("partida_prevista", exception.getField());
        assertEquals(
            "A data não pode ser superior a 1 ano",
            exception.getMessage()
        );
    }

    private PredictionRequestDTO buildRequest(LocalDateTime expectedTime) {
        return new PredictionRequestDTO(
            "AZ",
            "GRU",
            "SDU",
            expectedTime,
            600F,
            1.2F
        );
    }

}