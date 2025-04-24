package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Jdbc;

public class OracleJdbc implements Jdbc {
    @Override
    public void save() {
        System.out.println("Save in OracleJdbc");
    }
}
