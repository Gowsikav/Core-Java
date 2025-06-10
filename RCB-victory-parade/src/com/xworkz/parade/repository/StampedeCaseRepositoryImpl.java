package com.xworkz.parade.repository;

import com.xworkz.parade.dto.StampedeCaseDto;
import com.xworkz.parade.utils.JdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StampedeCaseRepositoryImpl implements StampedeCaseRepository{

    public StampedeCaseRepositoryImpl()
    {
        System.out.println("StampedeCaseRepository implementation constructor");
    }

    @Override
    public String persist(StampedeCaseDto stampedeCaseDto) {
        System.out.println("persist method in StampedeCaseRepository implementation");

        try{
            Class.forName(JdbcConnection.driver);
            Connection connection= DriverManager.getConnection(JdbcConnection.url,JdbcConnection.userName,JdbcConnection.password);
            if(connection==null)
            {
                System.out.println("Database not connected");
                return "failed";
            }
            else {
                System.out.println("Database Connection established");
            }
            String query="INSERT INTO stampede_case (event_name,location,no_of_deaths,no_of_injuries) " +
                    "VALUES ('"+stampedeCaseDto.getEvent()+"','"+stampedeCaseDto.getLocation()+"',"+stampedeCaseDto.getDeathsCount()+","+stampedeCaseDto.getInjuriesCount()+")";
            Statement statement=connection.createStatement();
            int result=statement.executeUpdate(query);
            if(result>0) {
                System.out.println("Rows Affected: " + result);
                return "success";
            }
            connection.close();
        } catch (ClassNotFoundException e) {
            System.err.println("Class is not found add mysql connection jar file");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        System.err.println("Data is not saved");
        return "failed";
    }
}
