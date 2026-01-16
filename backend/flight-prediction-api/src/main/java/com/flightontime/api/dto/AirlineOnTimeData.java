package com.flightontime.api.dto;

public record AirlineOnTimeData(
    String airline,
    Long totalFlights,
    Long onTimeFlights,
    Double onTimePercentage
) {

    public AirlineOnTimeData {
        if (onTimePercentage != null) {
            onTimePercentage = Math.round(onTimePercentage * 100.0) / 100.0;
        }
    }
}
