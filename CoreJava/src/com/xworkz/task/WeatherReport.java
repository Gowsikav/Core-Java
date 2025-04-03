package com.xworkz.task;

public class WeatherReport {
    Weather weather;

    public WeatherReport(Weather weather) {
        System.out.println("Constructor in WeatherReport");
        this.weather = weather;
    }

    public void invoke() {
        System.out.println("Invoking method in Weather");
        if (weather != null) {
            weather.forecast();
        } else {
            System.out.println("Weather is null");
        }
    }
}
