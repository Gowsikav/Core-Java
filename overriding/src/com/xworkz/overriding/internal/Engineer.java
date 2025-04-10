package com.xworkz.overriding.internal;

public class Engineer extends Employee {
    public Engineer() {
        System.out.println("Engineer constructor");
    }

    @Override
    public void describe() {
        System.out.println("This is an engineer who solves technical problems.");
    }

    public void code() {
        System.out.println("The engineer is writing code.");
    }
}
