package com.xworkz.overriding.internal;

public class Helicopter extends AirCraft1{
    public Helicopter() {
        System.out.println("Helicopter constructor");
    }

    @Override
    public void describe() {
        System.out.println("A helicopter is a type of aircraft that uses rotors to generate lift and can hover.");
    }

    public void hover() {
        System.out.println("The helicopter is hovering in the air.");
    }
}
