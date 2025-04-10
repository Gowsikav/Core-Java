package com.xworkz.overriding.internal;

public class Bicycle extends Bark{
    public Bicycle() {
        System.out.println("Bicycle constructor");
    }

    @Override
    public void describe() {
        System.out.println("This is a two-wheeled vehicle powered by pedaling.");
    }

    public void pedal() {
        System.out.println("Pedaling the bicycle forward.");
    }
}
