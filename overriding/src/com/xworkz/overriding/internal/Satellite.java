package com.xworkz.overriding.internal;

public class Satellite extends Spacecraft{
    public Satellite() {
        System.out.println("Satellite constructor");
    }

    @Override
    public void describe() {
        System.out.println("A satellite orbits a planet to collect data or aid communication.");
    }

    public void transmitSignal() {
        System.out.println("Satellite transmitting signal to Earth.");
    }
}
