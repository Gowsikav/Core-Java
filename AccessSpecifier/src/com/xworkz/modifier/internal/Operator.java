package com.xworkz.modifier.internal;

public class Operator
{
    public Operator() {
        System.out.println("Operator constructor");
    }

    public void operate() {
        System.out.println("running in operate method");
        Drone drone = new Drone();
        drone.fly();
        drone.hover();
    }
}
