package com.xworkz.honey.repository;

import com.xworkz.honey.dto.ProductDto;
import com.xworkz.honey.utils.JdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;


public class ProductRepositoryImpl implements ProductRepository{
    public ProductRepositoryImpl()
    {
        System.out.println("Product Repository Implementation constructor");
    }

    @Override
    public boolean persist(ProductDto productDto) {
        System.out.println("persist method in Product Repository Implementation");
        try{
            Class.forName(JdbcConnection.driverName);
            Connection connection= DriverManager.getConnection(JdbcConnection.jdbcUrl,JdbcConnection.UserName,JdbcConnection.password);
            if(connection!=null)
            {
                System.out.println("Database Connection Established");
                return true;
            }
            else {
                System.out.println("Database not Connected");
                return false;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
}
