package com.flightontime.api.dto;

public record StatisticsData(
    Long totalPredictions,
    Long totalOnTime,
    Long totalDelayed
) {
}
