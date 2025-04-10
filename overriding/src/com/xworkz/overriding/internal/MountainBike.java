package com.xworkz.overriding.internal;

public class MountainBike extends Bicycle1{
    public MountainBike() {
        System.out.println("MountainBike constructor");
    }

    @Override
    public void describe() {
        System.out.println("A mountain bike is designed for off-road cycling.");
    }

    public void addSuspension() {
        System.out.println("Adding suspension to the mountain bike for rough terrain.");
    }
}
