package com.xworkz.laptop.repository;

import com.xworkz.laptop.dto.LaptopDto;
import com.xworkz.laptop.utils.JdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LaptopRepositoryImpl implements LaptopRepository {
    public LaptopRepositoryImpl()
    {
        System.out.println("Laptop Repository implementation constructor");
    }

    @Override
    public boolean persist(LaptopDto laptopDto) {
        System.out.println("persist method in Laptop Repository implementation");

        try{
            Class.forName(JdbcConnection.driver);
            Connection connection= DriverManager.getConnection(JdbcConnection.url,JdbcConnection.userName,JdbcConnection.password);
            Statement statement=connection.createStatement();
            String query="INSERT INTO laptop_details VALUES(0,'"+laptopDto.getBrand()+"','"+laptopDto.getModel()+"'," +
                    " "+laptopDto.getPrice()+","+laptopDto.isAvailable()+",'"+laptopDto.getWarranty()+"','"+laptopDto.getManufacturedDate()+"'," +
                    " '"+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyy-MM-dd HH:mm:ss"))+"')";
            int row=statement.executeUpdate(query);
            if(row>0)
            {
                System.out.println("Details saved in DB");
                return true;
            }

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Details not saved");
        return false;
    }
}
