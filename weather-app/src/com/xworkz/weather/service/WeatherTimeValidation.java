package com.xworkz.weather.service;

import com.xworkz.weather.dto.WeatherDto;

import java.time.LocalTime;

public class WeatherTimeValidation implements WeatherService{
   public WeatherTimeValidation()
   {
       System.out.println("Weather Time validation constructor");
   }

    @Override
    public String save(WeatherDto weatherDto) {

        LocalTime sunRiseTime=weatherDto.getSunRiseTime();
        LocalTime sunSetTime=weatherDto.getSunSetTime();
        if(sunRiseTime==null || sunRiseTime.isAfter(sunSetTime))
        {
            System.err.println("Sun rise time is invalid");
            return "failed";
        }
        else {
            System.out.println("Sun rise time is valid");
        }

        if(sunSetTime==null || sunSetTime.isBefore(sunRiseTime))
        {
            System.err.println("Sun end time is invalid");
            return "failed";
        }
        else {
            System.out.println("Sun end time is valid");
        }

        LocalTime moonRiseTime=weatherDto.getMoonRiseTime();
        LocalTime moonSetTime=weatherDto.getMoonSetTime();
        if(moonRiseTime==null || moonSetTime==null)
        {
            System.err.println("moon set time  or moon rise time is null");
            return "failed";
        }

        if(moonRiseTime.isBefore(sunSetTime))
        {
            System.err.println("Moon rise time is invalid");
            return "failed";
        }
        else {
            System.out.println("Moon rise time is valid");
        }
        if(moonSetTime.isAfter(sunRiseTime))
        {
            System.err.println("Moon set time is invalid");
            return "failed";
        }
        else {
            System.out.println("Moon set time is valid");
        }

        LocalTime rainStartTime=weatherDto.getRainStartTime();
        LocalTime rainEndTime=weatherDto.getRainEndTime();
        if(rainStartTime==null)
        {
            System.err.println("Rain start time is invalid");
            return "failed";
        }
        else {
            System.out.println("Rain start time is valid");
        }
        if(rainEndTime==null || rainEndTime.isBefore(rainStartTime))
        {
            System.err.println("Rain end time is invalid");
            return "failed";
        }
        else {
            System.out.println("Rain end time is valid");
        }

        return "success";
    }
}
