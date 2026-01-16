package com.flightontime.api.dto;

public record RouteOnTimeData(
    String originAirport,
    String destinationAirport,
    Long totalFlights,
    Long onTimeFlights,
    Double onTimePercentage,
    Double avgFlightTime
) {

    public RouteOnTimeData {
        if (onTimePercentage != null) {
            onTimePercentage = Math.round(onTimePercentage * 100.0) / 100.0;
        }
        if(avgFlightTime != null) {
            avgFlightTime = Math.round(avgFlightTime * 100.0) / 100.0;
        }
    }
}
