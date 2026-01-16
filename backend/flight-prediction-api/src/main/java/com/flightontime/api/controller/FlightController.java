package com.flightontime.api.controller;

import com.flightontime.api.dto.*;
import com.flightontime.api.service.FlightService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {

    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }


    @GetMapping("/airlines/ontime")
    public ResponseEntity findAirlinesWithHighestOnTimeRate() {
        List<AirlineOnTimeData> airlines = flightService.findAirlinesWithHighestOnTimeRate();
        return ResponseEntity.ok(airlines);
    }

    @GetMapping("/airlines/delayed")
    public ResponseEntity findAirlinesWithHighestDelayRate() {
        List<AirlineDelayedData> airlines = flightService.findAirlinesWithHighestDelayRate();
        return ResponseEntity.ok(airlines);
    }

    @GetMapping("/routes/ontime")
    public ResponseEntity findRoutesWithHighestOnTimeRate() {
        List<RouteOnTimeData> routes = flightService.findRoutesWithHighestOnTimeRate();
        return ResponseEntity.ok(routes);
    }

    @GetMapping("/routes/delayed")
    public ResponseEntity findRoutesWithHighestDelayRate() {
        List<RouteDelayedData> routes = flightService.findRoutesWithHighestDelayRate();
        return ResponseEntity.ok(routes);
    }

    @GetMapping("/statistics")
    public ResponseEntity getGeneralStatistics() {
        StatisticsData statistics = flightService.getGeneralStatistics();
        return ResponseEntity.ok(statistics);
    }

    @GetMapping("/statistics/year")
    public ResponseEntity getStatisticsByYear() {
        List<StatisticsByYearData> statistics = flightService.getStatisticsByYear();
        return ResponseEntity.ok(statistics);
    }

    @GetMapping("/airlines/ontime/year/{year}")
    public ResponseEntity findAirlinesWithHighestOnTimeRateByYear(@PathVariable int year) {
        List<AirlineOnTimeData> airlines = flightService.findAirlinesWithHighestOnTimeRateByYear(year);
        return ResponseEntity.ok(airlines);
    }

}
