package com.flightontime.api.domain;

import com.flightontime.api.dto.*;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class FlightTest {

    @Autowired
    private FlightRepository flightRepository;

    @BeforeEach
    void setUp() {
        flightRepository.deleteAll();

        Flight record1 = Flight.builder()
            .icaoAirline("GLO")
            .icaoOrigin("SBGR")
            .icaoDestination("SBBR")
            .expectedTime(LocalDateTime.of(2023, 5, 15, 14, 30))
            .estimatedFlightTime(1.0F)
            .distance(60F)
            .prediction(0)
            .probability(0.92F)
            .build();

        Flight record2 = Flight.builder()
            .icaoAirline("GLO")
            .icaoOrigin("SBGR")
            .icaoDestination("SBBR")
            .expectedTime(LocalDateTime.of(2023, 5, 16, 10, 0))
            .estimatedFlightTime(1.2F)
            .distance(60F)
            .prediction(1)
            .probability(0.78F)
            .build();

        flightRepository.saveAll(List.of(record1, record2));
    }

    @Test
    void testFindAirlinesWithHighestOnTimeRate() {
        List<AirlineOnTimeData> result = flightRepository.findAirlinesWithHighestOnTimeRate();

        assertNotNull(result);

        System.out.println("==== Companhias =====");
        result.forEach(System.out::println);
    }

    @Test
    void testFindAirlinesWithHighestDelayRate() {
        List<AirlineDelayedData> result = flightRepository.findAirlinesWithHighestDelayRate();

        assertNotNull(result);

        System.out.println("=== Companhias ===");
        result.forEach(System.out::println);
    }

    @Test
    void testFindRoutesWithHighestOnTimeRate() {
        List<RouteOnTimeData> result = flightRepository.findRoutesWithHighestOnTimeRate();

        assertNotNull(result);

        System.out.println("=== Rotas ===");
        result.forEach(System.out::println);
    }

    @Test
    void testFindRoutesWithHighestDelayRate() {
        List<RouteDelayedData> result = flightRepository.findRoutesWithHighestDelayRate();

        assertNotNull(result);

        System.out.println("=== Rotas ===");
        result.forEach(System.out::println);
    }

    @Test
    void testGeneralStatistics() {
        Object result = flightRepository.getGeneralStatistics();

        assertNotNull(result);

        System.out.println("=== Estatísticas ===");
        System.out.println(result);
    }

    @Test
    void testGetStatisticsByYear() {
        List<StatisticsByYearData> result = flightRepository.getStatisticsByYear();

        assertNotNull(result);

        System.out.println("=== Estatísticas ===");
        result.forEach(System.out::println);
    }

    @Test
    void testCountTotalPredictions() {
        long total = flightRepository.count();

        assertTrue(total > 0, "Deveria ter predições");

        System.out.println(" === total: " + total);
    }
}
