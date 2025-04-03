package com.xworkz.task.runner;

import com.xworkz.task.Weather;
import com.xworkz.task.WeatherReport;

public class WeatherRunner {
    public static void main(String[] args) {
        Weather weather = new Weather();
        WeatherReport weatherReport = new WeatherReport(weather);
        weatherReport.invoke();
    }
}
