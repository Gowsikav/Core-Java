package com.xworkz.laptop.utils;

import lombok.Getter;

@Getter
public enum JdbcConnection {

    DRIVER("com.mysql.cj.jdbc.Driver"),
    URL("jdbc:mysql://localhost:3306/java_connection"),
    USER_NAME("root"),
    SECRET("gowsi@92");

    private final String property;

    private JdbcConnection(String property) {
        this.property=property;
    }
}
