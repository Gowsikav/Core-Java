package com.xworkz.overriding.internal;

public class Biscuits extends Balloon{
    public Biscuits() {
        System.out.println("Biscuits constructor");
    }

    @Override
    public void describe() {
        System.out.println("These are biscuit-themed balloons for parties.");
    }

    public void inflate() {
        System.out.println("Inflating biscuit-shaped balloons for the party.");
    }
}
