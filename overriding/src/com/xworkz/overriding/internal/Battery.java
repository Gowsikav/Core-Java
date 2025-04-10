package com.xworkz.overriding.internal;

public class Battery extends Ball{
    public Battery() {
        System.out.println("Battery constructor");
    }

    @Override
    public void describe() {
        System.out.println("This is a smart ball that uses a battery for sensors.");
    }

    public void charge() {
        System.out.println("Charging the smart ball's battery.");
    }
}
