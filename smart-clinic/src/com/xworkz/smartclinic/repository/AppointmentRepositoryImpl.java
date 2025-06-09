package com.xworkz.smartclinic.repository;

import com.xworkz.smartclinic.dto.AppointmentDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AppointmentRepositoryImpl implements AppointmentRepository{
    public AppointmentRepositoryImpl()
    {
        System.out.println("Appointment Repository Implementation constructor");
    }

    @Override
    public boolean persist(AppointmentDto appointmentDto) {
        System.out.println("Persist method in appointment Repository Implementation");

        String url="jdbc:mysql://localhost:3306/java_connection";
        String userName="root";
        String password="gowsi@92";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection(url,userName,password);
            System.out.println("Connection established "+connection);

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return true;
    }
}
