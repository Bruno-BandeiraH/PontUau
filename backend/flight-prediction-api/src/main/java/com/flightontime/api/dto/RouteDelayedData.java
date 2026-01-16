package com.flightontime.api.dto;

public record RouteDelayedData(
    String originAirport,
    String destinationAirport,
    Long totalFlights,
    Long delayedFlights,
    Double delayedPercentage,
    Double avgFlightTime
) {
    public RouteDelayedData {
        if (delayedPercentage != null ) {
            delayedPercentage = Math.round(delayedPercentage * 100.0) / 100.0;
        }
        if(avgFlightTime != null) {
            avgFlightTime = Math.round(avgFlightTime * 100.0) / 100.0;
        }
    }
}
