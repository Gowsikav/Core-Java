package com.xworkz.overriding.internal;

public class ElectricTrain extends Train{
    public ElectricTrain() {
        System.out.println("ElectricTrain constructor");
    }

    @Override
    public void describe() {
        System.out.println("An electric train is powered by electricity and is typically more energy-efficient.");
    }

    public void chargeBattery() {
        System.out.println("Charging the electric train's battery.");
    }
}
