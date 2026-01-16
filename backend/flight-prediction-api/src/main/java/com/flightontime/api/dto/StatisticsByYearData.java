package com.flightontime.api.dto;

public record StatisticsByYearData(
    Integer year,
    Long totalPredictions,
    Long totalOnTime,
    Long totalDelayed,
    Double onTimePercentage
) {
    public StatisticsByYearData {
        if (onTimePercentage != null) {
            onTimePercentage = Math.round(onTimePercentage * 100.0) / 100.0;
        }
    }
}
