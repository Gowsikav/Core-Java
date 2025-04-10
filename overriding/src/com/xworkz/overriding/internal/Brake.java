package com.xworkz.overriding.internal;

public class Brake extends Boots
{
    public Brake() {
        System.out.println("Brake constructor");
    }

    @Override
    public void describe() {
        System.out.println("This subclass represents a braking mechanism on rugged boots.");
    }

    public void stop() {
        System.out.println("Brake applied to stop movement.");
    }
}
