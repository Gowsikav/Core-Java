package com.xworkz.overriding.internal;

public class Bottle extends Oil{
    public Bottle() {
        System.out.println("Bottle constructor");
    }

    @Override
    public void describe() {
        System.out.println("This is a bottle used to store baby oil.");
    }

    public void pour() {
        System.out.println("Pouring the oil from the bottle.");
    }
}
