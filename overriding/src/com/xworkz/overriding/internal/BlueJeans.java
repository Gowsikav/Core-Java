package com.xworkz.overriding.internal;

public class BlueJeans extends Blinds{
    public BlueJeans() {
        System.out.println("BlueJeans constructor");
    }

    @Override
    public void describe() {
        System.out.println("These blue jeans are designed with a layered blind-style pattern.");
    }

    public void wear() {
        System.out.println("Wearing blue jeans with confident style.");
    }
}
