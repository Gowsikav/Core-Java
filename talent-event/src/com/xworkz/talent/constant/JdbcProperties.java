package com.xworkz.talent.constant;

import lombok.Getter;

@Getter
public enum JdbcProperties {
    DRIVER("com.mysql.cj.jdbc.Driver"),
    URL("jdbc:mysql://localhost:3306/java_connection"),
    USERNAME("root"),
    SECRET("gowsi@92");

    public final String property;

    private JdbcProperties(String property)
    {
        this.property=property;
    }

}
