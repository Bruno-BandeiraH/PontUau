package com.flightontime.api.domain;


import com.flightontime.api.dto.FlightDTO;
import com.flightontime.api.dto.PredictionRequestDTO;
import com.flightontime.api.dto.PredictionResponseDTO;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_flights",
        indexes = {
                @Index(name = "idx_airline", columnList = "airline"),
                @Index(name = "idx_origin", columnList = "origin_airport"),
                @Index(name = "idx_destination", columnList = "destination_airport"),
                @Index(name = "idx_distance", columnList = "distance"),
                @Index(name = "idx_prediction", columnList = "prediction"),
                @Index(name = "idx_probability_of_delay", columnList = "probability")
        })
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Dados de Entrada (PredicitionRequestDTO)
    @Column(name = "airline", nullable = false, length = 10)
    private String icaoAirline;

    @Column(name = "origin_airport", nullable = false, length = 10)
    private String icaoOrigin;

    @Column(name = "destination_airport", nullable = false, length = 10)
    private String icaoDestination;

    @Column(name = "expected_time", nullable = false)
    private LocalDateTime expectedTime;

    @Column(name = "estimated_flight_time", nullable = false)
    private Float estimatedFlightTime;

    @Column(name = "distance", nullable = false)
    private Float distance;

    // Dados de Saída (PredictionResponseDTO)
    @Column(name = "prediction", nullable = false, length = 2)
    private Integer prediction;

    @Column(name = "probability", nullable = false)
    private Float probability;

    public Flight(FlightDTO data) {
        this.icaoAirline = data.icaoAirline();
        this.icaoOrigin = data.icaoOrigin();
        this.icaoDestination = data.icaoDestination();
        this.estimatedFlightTime = data.estimatedFlightTime();
        this.distance = data.distance();
        this.expectedTime = data.expectedTime();
        this.prediction = data.prediction();
        this.probability = data.probability();
    }

    public static Flight fromDTOs(
            PredictionRequestDTO requestDTO,
            PredictionResponseDTO responseDTO) {

        return Flight.builder()
                .icaoAirline(requestDTO.icaoAirline())
                .icaoOrigin(requestDTO.icaoOrigin())
                .icaoDestination(requestDTO.icaoDestination())
                .expectedTime(requestDTO.expectedTime())
                .distance(requestDTO.distance())
                .estimatedFlightTime(requestDTO.estimatedFlightTime())
                .prediction(responseDTO.prediction())
                .probability(responseDTO.probability())
                .build();
    }


}
