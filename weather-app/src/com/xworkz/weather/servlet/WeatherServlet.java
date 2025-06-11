package com.xworkz.weather.servlet;

import com.xworkz.weather.dto.WeatherDto;
import com.xworkz.weather.service.WeatherService;
import com.xworkz.weather.service.WeatherServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

@WebServlet(urlPatterns = "/weather")
public class WeatherServlet extends HttpServlet{
    public WeatherServlet()
    {
        System.out.println("Weather Servlet Constructor");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost Method in Weather Servlet");

        String placeName=req.getParameter("placeName");
        String weather=req.getParameter("weather");
        String minTempStr=req.getParameter("minTemp");
        String maxTempStr=req.getParameter("maxTemp");
        String cloudy=req.getParameter("cloudy");
        String raining=req.getParameter("raining");
        String rainMMStr=req.getParameter("rain");
        String humidityStr=req.getParameter("humidity");
        String windSpeedStr=req.getParameter("windSpeed");
        String precipitationStr=req.getParameter("precipitation");
        String sunRiseTimeStr=req.getParameter("sunRiseTime");
        String sunSetTimeStr=req.getParameter("sunSetTime");
        String moonRiseTimeStr=req.getParameter("moonRiseTime");
        String moonSetTimeStr=req.getParameter("moonSetTime");
        String rainStartTimeStr=req.getParameter("rainStartTime");
        String rainEndTimeStr=req.getParameter("rainEndTime");

        double minTemp=0;
        if(minTempStr!=null && !minTempStr.isEmpty())
        {
            minTemp=Double.parseDouble(minTempStr);
        }
        else{
            System.err.println("Min value is invalid");
        }
        double maxTemp=0;
        if(maxTempStr!=null && !maxTempStr.isEmpty())
        {
            maxTemp=Double.parseDouble(maxTempStr);
        }
        else{
            System.err.println("Max value is invalid");
        }
        double rainMM=0;
        if(rainMMStr!=null && !rainMMStr.isEmpty())
        {
            rainMM=Double.parseDouble(rainMMStr);
        }
        else {
            System.err.println("Rain MM is Invalid");
        }
        int humidity=0;
        if(humidityStr!=null && !humidityStr.isEmpty())
        {
            humidity=Integer.parseInt(humidityStr);
        }
        else {
            System.err.println("Humidity is invalid");
        }
        double windSpeed=0;
        if(windSpeedStr!=null && !windSpeedStr.isEmpty())
        {
            windSpeed=Double.parseDouble(windSpeedStr);
        }
        else {
            System.err.println("Wind Speed is Invalid");
        }
        double precipitation=0;
        if(precipitationStr!=null && !precipitationStr.isEmpty())
        {
            precipitation=Double.parseDouble(precipitationStr);
        }
        else {
            System.err.println("Precipitation is Invalid");
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime sunRiseTime=null;
        LocalTime sunSetTime = null;
        LocalTime moonRiseTime = null;
        LocalTime moonSetTime = null;
        LocalTime rainEndTime = null;
        LocalTime rainStartTime = null;
        try {
            if (sunRiseTimeStr != null && !sunRiseTimeStr.isEmpty()) {
                sunRiseTime = LocalTime.parse(sunRiseTimeStr, formatter);
            }

            if (sunSetTimeStr != null && !sunSetTimeStr.isEmpty()) {
                sunSetTime = LocalTime.parse(sunSetTimeStr, formatter);
            }

            if (moonRiseTimeStr != null && !moonRiseTimeStr.isEmpty()) {
                moonRiseTime = LocalTime.parse(moonRiseTimeStr, formatter);
            }

            if (moonSetTimeStr != null && !moonSetTimeStr.isEmpty()) {
                moonSetTime = LocalTime.parse(moonSetTimeStr, formatter);
            }

            if (rainStartTimeStr != null && !rainStartTimeStr.isEmpty()) {
                rainStartTime = LocalTime.parse(rainStartTimeStr, formatter);
            }

            if (rainEndTimeStr != null && !rainEndTimeStr.isEmpty()) {
                rainEndTime = LocalTime.parse(rainEndTimeStr, formatter);
            }
        }catch (DateTimeParseException e)
        {
            System.err.println(e.getMessage());
        }

        WeatherDto weatherDto=new WeatherDto(placeName,weather,minTemp,maxTemp,cloudy,raining,rainMM,humidity,
                windSpeed,precipitation,sunRiseTime,sunSetTime,moonRiseTime,moonSetTime,rainStartTime,rainEndTime);

        WeatherService weatherService=new WeatherServiceImpl();
        String result=weatherService.save(weatherDto);
        System.out.println("Result: "+result);

        RequestDispatcher requestDispatcher;
        if(result.equalsIgnoreCase("success"))
        {
            requestDispatcher=req.getRequestDispatcher("weather-success.jsp");
            req.setAttribute("weatherDto",weatherDto);
            req.setAttribute("message","Details saved in DataBase");
        }
        else{
            requestDispatcher=req.getRequestDispatcher("weather.jsp");
            req.setAttribute("message","Wrong information");
        }
        requestDispatcher.forward(req,resp);

    }
}
