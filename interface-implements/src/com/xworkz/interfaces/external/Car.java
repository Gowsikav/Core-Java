package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Vehicle;

public class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("Car accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Car braking");
    }

    @Override
    public void honk() {
        System.out.println("Car honking");
    }
}
