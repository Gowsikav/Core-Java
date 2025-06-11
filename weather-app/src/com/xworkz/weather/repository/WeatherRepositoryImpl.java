package com.xworkz.weather.repository;

import com.xworkz.weather.dto.WeatherDto;
import com.xworkz.weather.utils.JdbcConnection;

import java.sql.*;
import java.time.LocalDateTime;

public class WeatherRepositoryImpl implements WeatherRepository {
    public WeatherRepositoryImpl() {
        System.out.println("WeatherRepository implementation constructor");
    }

    @Override
    public String persist(WeatherDto weatherDto) {
        System.out.println("persist method in WeatherRepository implementation");

        try{
            Class.forName(JdbcConnection.driver);
            Connection connection= DriverManager.getConnection(JdbcConnection.url,JdbcConnection.userName,JdbcConnection.password);
            if(connection==null)
            {
                System.err.println("Database is not connected");
                return "failed";
            }
            System.out.println("Database connection established");
            Statement statement=connection.createStatement();
            LocalDateTime now = LocalDateTime.now();
            Timestamp timestamp = Timestamp.valueOf(now);

            String query="INSERT IGNORE INTO weather_report VALUES(0,'"+weatherDto.getPlaceName()+"','"+weatherDto.getWeather()+"',"+weatherDto.getMinTemp()+","+weatherDto.getMaxTemp()+"," +
                    " '"+weatherDto.getCloudy()+"','"+weatherDto.getRaining()+"',"+weatherDto.getRainMM()+","+weatherDto.getHumidity()+","+weatherDto.getWindSpeed()+"," +
                    " "+weatherDto.getPrecipitation()+",'"+weatherDto.getSunRiseTime()+"','"+weatherDto.getSunSetTime()+"','"+weatherDto.getMoonRiseTime()+"'," +
                    " '"+weatherDto.getMoonSetTime()+"','"+weatherDto.getRainStartTime()+"','"+weatherDto.getRainEndTime()+"','"+timestamp+"');";
            int row=statement.executeUpdate(query);
            if(row>0)
            {
                System.out.println("Details saved in DB");
                return "success";
            }
            connection.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Add the mysql connector jar file");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Details not saved in DB");
        return "failed";
    }
}
