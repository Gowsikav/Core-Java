package com.xworkz.overriding.internal;

public class WashingMachine extends Appliance
{
    public WashingMachine() {
        System.out.println("WashingMachine constructor");
    }

    @Override
    public void describe() {
        System.out.println("This is a washing machine used to clean clothes.");
    }

    public void wash() {
        System.out.println("Washing clothes in the washing machine.");
    }
}
