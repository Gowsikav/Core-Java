package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Jdbc;

public class MysqlJdbc implements Jdbc {
    @Override
    public void save() {
        System.out.println("save in MysqlJdbc");
    }
}
