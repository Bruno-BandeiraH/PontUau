package com.flightontime.api.domain;

import com.flightontime.api.dto.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

@org.springframework.stereotype.Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {

    @Query("""
            SELECT new com.flightontime.api.dto.AirlineOnTimeData(
                f.icaoAirline,
                COUNT(f),
                SUM(CASE WHEN f.prediction = 0 THEN 1 ELSE 0 END),
                (SUM(CASE WHEN f.prediction = 0 THEN 1 ELSE 0 END) * 100.0 / COUNT(f))
            )
            FROM Flight f
            GROUP BY f.icaoAirline
            HAVING COUNT(f) >= 1
            ORDER BY (SUM(CASE WHEN f.prediction = 0 THEN 1 ELSE 0 END) * 100.0 / COUNT(f)) DESC
        """)
    List<AirlineOnTimeData> findAirlinesWithHighestOnTimeRate();


    @Query("""
            SELECT new com.flightontime.api.dto.RouteOnTimeData(
                f.icaoOrigin as originAirport,
                f.icaoDestination as destinationAirport,
                COUNT(f) as totalFlights,
                SUM(CASE WHEN f.prediction = 0 THEN 1 ELSE 0 END) as onTimeFlights,
                (SUM(CASE WHEN f.prediction = 0 THEN 1 ELSE 0 END) * 100.0 / COUNT(f)) as onTimePercentage,
                AVG(f.estimatedFlightTime) as avgFlightTime
                )
                FROM Flight f
                GROUP BY f.icaoOrigin, f.icaoDestination
                HAVING COUNT(f) >= 1
                ORDER BY (SUM(CASE WHEN f.prediction = 0 THEN 1 ELSE 0 END) * 100.0 / COUNT(f)) DESC
        """)
    List<RouteOnTimeData> findRoutesWithHighestOnTimeRate();


    @Query("""
            SELECT new com.flightontime.api.dto.AirlineDelayedData(
                f.icaoAirline as airline,
                COUNT(f) as totalFlights,
                SUM(CASE WHEN f.prediction = 1 THEN 1 ELSE 0 END) as delayedFlights,
                (SUM(CASE WHEN f.prediction = 1 THEN 1 ELSE 0 END) * 100.0 / COUNT(f)) as delayPercentage
            )
            FROM Flight f
            GROUP BY f.icaoAirline
            HAVING COUNT(f) >= 1
            ORDER BY (SUM(CASE WHEN f.prediction = 1 THEN 1 ELSE 0 END) * 100.0 / COUNT(f)) DESC
        """)
    List<AirlineDelayedData> findAirlinesWithHighestDelayRate();


    @Query("""
            SELECT new com.flightontime.api.dto.RouteDelayedData(
                f.icaoOrigin as originAirport,
                f.icaoDestination as destinationAirport,
                COUNT(f) as totalFlights,
                SUM(CASE WHEN f.prediction = 1 THEN 1 ELSE 0 END) as delayedFlights,
                (SUM(CASE WHEN f.prediction = 1 THEN 1 ELSE 0 END) * 100.0 / COUNT(f)) as delayPercentage,
                AVG(f.estimatedFlightTime) as avgFlightTime
            )
            FROM Flight f
            GROUP BY f.icaoOrigin, f.icaoDestination
            HAVING COUNT(f) >= 1
            ORDER BY (SUM(CASE WHEN f.prediction = 1 THEN 1 ELSE 0 END) * 100.0 / COUNT(f)) DESC
        """)
    List<RouteDelayedData> findRoutesWithHighestDelayRate();

    @Query("""
            SELECT new com.flightontime.api.dto.StatisticsData(
                COUNT(f) as totalPredictions,
                SUM(CASE WHEN f.prediction = 0 THEN 1 ELSE 0 END) as totalOnTime,
                SUM(CASE WHEN f.prediction = 1 THEN 1 ELSE 0 END) as totalDelay
            )
            FROM Flight f
        """)
    StatisticsData getGeneralStatistics();

    @Query("""
        SELECT new com.flightontime.api.dto.StatisticsByYearData(
            YEAR(f.expectedTime) as year,
            COUNT(f) as totalPredictions,
            SUM(CASE WHEN f.prediction = 0 THEN 1 ELSE 0 END) as totalOnTime,
            SUM(CASE WHEN f.prediction = 1 THEN 1 ELSE 0 END) as totalDelayed,
            (SUM(CASE WHEN f.prediction = 0 THEN 1 ELSE 0 END) * 100.0 / COUNT(f)) as onTimePercentage
        )
        FROM Flight f
        GROUP BY YEAR(f.expectedTime)
        ORDER BY YEAR(f.expectedTime) DESC
        """)
    List<StatisticsByYearData> getStatisticsByYear();

    @Query("""
        SELECT new com.flightontime.api.dto.AirlineOnTimeData(
            f.icaoAirline,
            COUNT(f) as totalFlights,
            SUM(CASE WHEN f.prediction = 0 THEN 1 ELSE 0 END) as onTimeFlights,
            CAST(SUM(CASE WHEN f.prediction = 0 THEN 1 ELSE 0 END) AS double) * 100.0 / COUNT(f) as onTimePercentage
        )
        FROM Flight f
        WHERE f.expectedTime IS NOT NULL 
          AND YEAR(f.expectedTime) = :year
        GROUP BY f.icaoAirline
        HAVING COUNT(f) >= 2
        ORDER BY (CAST(SUM(CASE WHEN f.prediction = 0 THEN 1 ELSE 0 END) AS double) * 100.0 / COUNT(f)) DESC
    """)
    List<AirlineOnTimeData> findAirlinesWithHighestOnTimeRateByYear(@Param("year") int year);
}
