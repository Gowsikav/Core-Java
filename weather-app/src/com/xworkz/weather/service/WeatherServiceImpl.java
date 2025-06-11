package com.xworkz.weather.service;

import com.xworkz.weather.dto.WeatherDto;
import com.xworkz.weather.repository.WeatherRepository;
import com.xworkz.weather.repository.WeatherRepositoryImpl;

public class WeatherServiceImpl implements WeatherService{
    public WeatherServiceImpl()
    {
        System.out.println("Weather service Implementation Constructor");
    }

    @Override
    public String save(WeatherDto weatherDto) {
        System.out.println("save method in Weather service Implementation");

        if(weatherDto==null)
        {
            System.err.println("Weather Dto is null");
            return "Failed";
        }
        else {
            System.out.println("Weather Dto is not null");
        }
        String placeName= weatherDto.getPlaceName();
        if(placeName==null || placeName.length()<3|| placeName.length()>25)
        {
            System.err.println("Place Name is Invalid");
            return "Failed";
        }
        else{
            System.out.println("Place Name is valid");
        }
        String weather= weatherDto.getWeather();
        if(weather==null || weather.length()<3|| weather.length()>25)
        {
            System.err.println("weather is Invalid");
            return "Failed";
        }
        else{
            System.out.println("Weather is valid");
        }
        double minTemp= weatherDto.getMinTemp();
        if(minTemp<-100) {
            System.err.println("Min temperature is Invalid");
            return "Failed";
        }else {
            System.out.println("Min temperature is valid");
        }
        double maxTemp= weatherDto.getMaxTemp();
        if(maxTemp<-100) {
            System.err.println("Max temperature is Invalid");
            return "Failed";
        }else {
            System.out.println("Max temperature is valid");
        }
        if(minTemp>maxTemp)
        {
            System.err.println("Min temperature should be less than max temperature");
            return "Failed";
        }
        String cloudy= weatherDto.getCloudy();
        if(cloudy!=null && !cloudy.isEmpty())
        {
            System.out.println("cloudy is valid");
        }
        else {
            System.err.println("cloudy is invalid");
            return "failed";
        }
        String raining= weatherDto.getRaining();
        if(raining!=null && !raining.isEmpty())
        {
            System.out.println("Raining is valid");
        }
        else {
            System.err.println("Raining is invalid");
            return "failed";
        }
        int humidity= weatherDto.getHumidity();
        if(humidity<0 || humidity>100)
        {
            System.err.println("Humidity is invalid");
            return "Failed";
        }
        else {
            System.out.println("Humidity is valid");
        }
        double windSpeed= weatherDto.getWindSpeed();
        if(windSpeed<0)
        {
            System.err.println("Wind speed is invalid");
            return "failed";
        }
        else {
            System.out.println("wind speed is valid");
        }
        double precipitation= weatherDto.getPrecipitation();
        if(precipitation<0 || precipitation>100)
        {
            System.err.println("precipitation is invalid");
            return "failed";
        }
        else {
            System.out.println("precipitation is valid");
        }
        WeatherService weatherService=new WeatherTimeValidation();
        String res=weatherService.save(weatherDto);
        if(res.equalsIgnoreCase("failed"))
        {
            return "Failed";
        }

        WeatherRepository weatherRepository=new WeatherRepositoryImpl();
        return weatherRepository.persist(weatherDto);
    }
}
