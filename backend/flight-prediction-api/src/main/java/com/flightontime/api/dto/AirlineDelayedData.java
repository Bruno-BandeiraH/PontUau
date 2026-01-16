package com.flightontime.api.dto;

public record AirlineDelayedData(
    String airline,
    Long totalFlights,
    Long delayedFlights,
    Double delayPercentage
) {
    public AirlineDelayedData {
        if (delayPercentage != null) {
            delayPercentage = Math.round(delayPercentage * 100.0) / 100.0;
        }
    }
}
