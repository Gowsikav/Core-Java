package com.xworkz.talent.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.xworkz.talent.constant.JdbcProperties;

public class DBUtils {
    public DBUtils()
    {
        System.out.println("DBUtils constructor");
    }

    public static Connection getConnection()
    {
        try {
            Class.forName(JdbcProperties.DRIVER.getProperty());
            return DriverManager.getConnection(JdbcProperties.URL.getProperty(),JdbcProperties.USERNAME.getProperty(),JdbcProperties.SECRET.getProperty());
        }catch (ClassNotFoundException | SQLException e)
        {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
