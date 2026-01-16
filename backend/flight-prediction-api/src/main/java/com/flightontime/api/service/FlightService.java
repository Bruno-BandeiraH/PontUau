package com.flightontime.api.service;

import com.flightontime.api.domain.Flight;
import com.flightontime.api.domain.FlightRepository;
import com.flightontime.api.dto.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {

    private final FlightRepository repository;

    public FlightService(FlightRepository repository) {
        this.repository = repository;
    }


    public void save(FlightDTO data) {
        Flight flight = new Flight(data);
        repository.save(flight);
    }

    public List<AirlineOnTimeData> findAirlinesWithHighestOnTimeRate() {
        return repository.findAirlinesWithHighestOnTimeRate();
    }

    public List<AirlineDelayedData> findAirlinesWithHighestDelayRate() {
        return repository.findAirlinesWithHighestDelayRate();
    }

    public List<RouteOnTimeData> findRoutesWithHighestOnTimeRate() {
        return repository.findRoutesWithHighestOnTimeRate();
    }

    public List<RouteDelayedData> findRoutesWithHighestDelayRate() {
        return repository.findRoutesWithHighestDelayRate();
    }

    public StatisticsData getGeneralStatistics() {
        return repository.getGeneralStatistics();
    }

    public List<StatisticsByYearData> getStatisticsByYear() {
        return repository.getStatisticsByYear();
    }

    public List<AirlineOnTimeData> findAirlinesWithHighestOnTimeRateByYear(int year) {
        return repository.findAirlinesWithHighestOnTimeRateByYear(year);
    }

}
