package com.xworkz.overriding.internal;

public class Engine extends VehiclePart{
    public Engine() {
        System.out.println("Engine constructor");
    }

    @Override
    public void describe() {
        System.out.println("This is the engine, the heart of the vehicle.");
    }

    public void start() {
        System.out.println("The engine is starting.");
    }
}
