package com.xworkz.overriding.internal;

public class ElectricTruck extends Truck{
    public ElectricTruck() {
        System.out.println("ElectricTruck constructor");
    }

    @Override
    public void describe() {
        System.out.println("An electric truck is a truck powered by electricity rather than gasoline.");
    }

    public void chargeBattery() {
        System.out.println("Charging the electric truck's battery.");
    }
}
