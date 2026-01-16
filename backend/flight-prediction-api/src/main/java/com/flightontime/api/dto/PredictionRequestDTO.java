package com.flightontime.api.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;

import java.time.LocalDateTime;

public record PredictionRequestDTO(
    @JsonProperty("icao_empresa")
    @NotBlank(message = "icao_empresa é obrigatória")
    @Pattern(regexp = "[A-Z]{3}", message = "O campo deve conter 3 letras maiúsculas")
    String icaoAirline,

    @JsonProperty("icao_aerodromo_origem")
    @NotBlank(message = "icao_aerodromo_origem é obrigatório")
    @Pattern(regexp = "[A-Z]{4}", message = "O campo deve conter 4 letras maiúsculas")
    String icaoOrigin,

    @JsonProperty("icao_aerodromo_destino")
    @NotBlank(message = "icao_aerodromo_destino é obrigatório")
    @Pattern(regexp = "[A-Z]{4}", message = "O campo deve conter 4 letras maiúsculas")
    String icaoDestination,

    @JsonProperty("partida_prevista")
    @NotNull(message = "partida_prevista não pode ser nula")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    LocalDateTime expectedTime,

    @JsonProperty("distancia_km")
    @NotNull(message = "distancia_km não pode ser nulo")
    @DecimalMax(value = "3500.0", message = "A distância não pode ser superior a 3500km")
    @DecimalMin(value = "50.0", message = "A distância não pode ser inferior a 50km")
    Float distance,

    @JsonProperty("tempo_voo_estimado_hr")
    @NotNull(message = "tempo_voo_estimado_hr não pode ser nulo")
    @DecimalMin(value = "0.2", message = "o tempo de voo não pode ser menor que 20 minutos")
    @DecimalMax(value = "7.0", message = "O tempo de voo não pode ser superior a 7 horas")
    Float estimatedFlightTime
) {
}

