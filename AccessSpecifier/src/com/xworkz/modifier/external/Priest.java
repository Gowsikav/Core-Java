package com.xworkz.modifier.external;

import com.xworkz.modifier.internal.Temple;

public class Priest {
    public Priest()
    {
        System.out.println("Priest constructor");
    }
    public void displayDetails()
    {
        System.out.println("running in displayDetails method");
        Temple temple=new Temple();
        temple.open();
    }
}
