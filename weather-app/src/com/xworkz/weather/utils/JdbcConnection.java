package com.xworkz.weather.utils;

public class JdbcConnection {
    public JdbcConnection()
    {
        System.out.println("Jdbc Connection constructor");
    }

    public static final String driver="com.mysql.cj.jdbc.Driver";
    public static final String url="jdbc:mysql://localhost:3306/java_connection";
    public static final String userName="root";
    public static final String password="gowsi@92";
}
