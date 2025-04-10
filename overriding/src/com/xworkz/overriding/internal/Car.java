package com.xworkz.overriding.internal;

public class Car extends Vehicle
{
    public Car() {
        System.out.println("Car constructor");
    }

    @Override
    public void describe() {
        System.out.println("This is a car, a specific type of vehicle.");
    }

    public void drive() {
        System.out.println("The car is driving.");
    }
}
