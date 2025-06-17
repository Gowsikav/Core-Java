package com.xworkz.laptop.repository;

import com.xworkz.laptop.dto.LaptopDto;
import com.xworkz.laptop.utils.JdbcConnection;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

public class LaptopRepositoryImpl implements LaptopRepository {
    public LaptopRepositoryImpl()
    {
        System.out.println("Laptop Repository implementation constructor");
    }

    @Override
    public boolean persist(LaptopDto laptopDto) {
        System.out.println("persist method in Laptop Repository implementation");

        try{
            Class.forName(JdbcConnection.DRIVER.getProperty());
            Connection connection= DriverManager.getConnection(JdbcConnection.URL.getProperty(),JdbcConnection.USER_NAME.getProperty(), JdbcConnection.SECRET.getProperty());
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

    @Override
    public Optional<LaptopDto> findById(int laptopId) {
        System.out.println("findById method in Laptop Repository implementation");
        try{
            Class.forName(JdbcConnection.DRIVER.getProperty());
            Connection connection=DriverManager.getConnection(JdbcConnection.URL.getProperty(),JdbcConnection.USER_NAME.getProperty(), JdbcConnection.SECRET.getProperty());
            Statement statement=connection.createStatement();
            String query="SELECT * FROM laptop_details AS laptop where laptop.id="+laptopId+";";
            ResultSet resultSet=statement.executeQuery(query);
            while(resultSet.next())
            {
                String brand=resultSet.getString("brand");
                String model=resultSet.getString("model");
                double price=resultSet.getDouble("price");
                boolean isAvailable=resultSet.getBoolean("is_available");
                String warranty=resultSet.getString("warranty");
                LocalDate manufacturedDate=resultSet.getDate("manufactured_date").toLocalDate();

                LaptopDto laptopDto=new LaptopDto(brand,model,price,isAvailable,warranty,manufacturedDate);
                return Optional.of(laptopDto);
            }

        } catch (SQLException |ClassNotFoundException exception) {
            System.out.println(exception.getMessage());
        }

        return Optional.empty();
    }
}
