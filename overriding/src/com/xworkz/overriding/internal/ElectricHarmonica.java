package com.xworkz.overriding.internal;

public class ElectricHarmonica extends Harmonica{
    public ElectricHarmonica() {
        System.out.println("ElectricHarmonica constructor");
    }

    @Override
    public void describe() {
        System.out.println("An electric harmonica is an amplified version of the traditional harmonica.");
    }

    public void adjustVolume() {
        System.out.println("Adjusting the volume of the electric harmonica.");
    }
}
