package com.xworkz.modifier.internal;

public class Drone
{
    public Drone() {
        System.out.println("Drone constructor");
    }

    public void fly() {
        System.out.println("public fly method in Drone");
    }

    private void calibrate() {
        System.out.println("private calibrate method in Drone");
    }

    void hover() {
        System.out.println("package-default hover method in Drone");
    }
}
