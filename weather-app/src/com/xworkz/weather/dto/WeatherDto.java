package com.xworkz.weather.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class WeatherDto {
    public WeatherDto()
    {
        System.out.println("Weather Dto constructor");
    }
    private String placeName;
    private String weather;
    private double minTemp;
    private double maxTemp;
    private String cloudy;
    private String raining;
    private double rainMM;
    private int humidity;
    private double windSpeed;
    private double precipitation;
    private LocalTime sunRiseTime;
    private LocalTime sunSetTime;
    private LocalTime moonRiseTime;
    private LocalTime moonSetTime;
    private LocalTime rainStartTime;
    private LocalTime rainEndTime;
}
