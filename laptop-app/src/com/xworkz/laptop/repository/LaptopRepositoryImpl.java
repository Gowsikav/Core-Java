package com.xworkz.laptop.repository;

import com.xworkz.laptop.dto.LaptopDto;
import com.xworkz.laptop.utils.JdbcConnection;

import java.sql.*;
import java.time.LocalDate;
import java.util.Arrays;
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

            String query = "INSERT INTO laptop_details (brand, model, price, is_available, warranty, manufactured_date, created_at) VALUES (?, ?, ?, ?, ?, ?, ?)";
            System.out.println(query);
            PreparedStatement preparedStatement=connection.prepareStatement(query);

            preparedStatement.setString(1,laptopDto.getBrand());
            preparedStatement.setString(2,laptopDto.getModel());
            preparedStatement.setDouble(3,laptopDto.getPrice());
            preparedStatement.setBoolean(4,laptopDto.isAvailable());
            preparedStatement.setString(5,laptopDto.getWarranty());
            preparedStatement.setDate(6, Date.valueOf(laptopDto.getManufacturedDate()));
            preparedStatement.setTimestamp(7,laptopDto.getCreated_at());

            int row=preparedStatement.executeUpdate();
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

            String query="SELECT * FROM laptop_details WHERE id = ?";
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            preparedStatement.setInt(1,laptopId);
            ResultSet resultSet=preparedStatement.executeQuery();
            while(resultSet.next())
            {
                String brand=resultSet.getString("brand");
                String model=resultSet.getString("model");
                double price=resultSet.getDouble("price");
                boolean isAvailable=resultSet.getBoolean("is_available");
                String warranty=resultSet.getString("warranty");
                LocalDate manufacturedDate=resultSet.getDate("manufactured_date").toLocalDate();
                Timestamp created_at=resultSet.getTimestamp("created_at");

                LaptopDto laptopDto=new LaptopDto(brand,model,price,isAvailable,warranty,manufacturedDate,created_at);
                return Optional.of(laptopDto);
            }

        } catch (SQLException |ClassNotFoundException exception) {
            System.out.println(exception.getMessage());
        }

        return Optional.empty();
    }

    @Override
    public LaptopDto[] findAll() {
        System.out.println("findAll method in Laptop Repository implementation");
        int index=0;

        LaptopDto[] laptopDtos=new LaptopDto[1];
        try{
            Class.forName(JdbcConnection.DRIVER.getProperty());
            Connection connection=DriverManager.getConnection(JdbcConnection.URL.getProperty(),JdbcConnection.USER_NAME.getProperty(), JdbcConnection.SECRET.getProperty());

            String query="SELECT * FROM laptop_details;";
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            ResultSet resultSet=preparedStatement.executeQuery();
            while(resultSet.next())
            {
                LaptopDto laptopDto=new LaptopDto();
                laptopDto.setBrand(resultSet.getString("brand"));
                laptopDto.setModel(resultSet.getString("model"));
                laptopDto.setPrice(resultSet.getDouble("price"));
                laptopDto.setAvailable(resultSet.getBoolean("is_available"));
                laptopDto.setWarranty(resultSet.getString("warranty"));
                laptopDto.setManufacturedDate(resultSet.getDate("manufactured_date").toLocalDate());
                laptopDto.setCreated_at(resultSet.getTimestamp("created_at"));

                laptopDtos[index]=laptopDto;
                index++;
                laptopDtos = Arrays.copyOf(laptopDtos, index+1);

            }

        } catch (SQLException |ClassNotFoundException exception) {
            System.out.println(exception.getMessage());
        }

        return laptopDtos;
    }
}
