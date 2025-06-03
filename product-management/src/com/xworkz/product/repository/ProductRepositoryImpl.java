package com.xworkz.product.repository;

import com.xworkz.product.dto.ProductDto;
import com.xworkz.product.utils.JdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ProductRepositoryImpl implements ProductRepository{
    public ProductRepositoryImpl() {
        System.out.println("Product Repository Implementation Constructor");
    }

    @Override
    public boolean persist(ProductDto productDto) {
        System.out.println("persist method in product repository implementation");

        try{
            Class.forName(JdbcConnection.driverName);
            Connection connection= DriverManager.getConnection(JdbcConnection.jdbcUrl,JdbcConnection.UserName,JdbcConnection.password);
            if(connection==null)
            {
                System.out.println("Database not Connected");
                return false;
            }
            else {
                System.out.println("Database connection Established");
                return true;
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
}
