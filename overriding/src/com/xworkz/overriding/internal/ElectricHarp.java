package com.xworkz.overriding.internal;

public class ElectricHarp extends Harp{
    public ElectricHarp() {
        System.out.println("ElectricHarp constructor");
    }

    @Override
    public void describe() {
        System.out.println("An electric harp has electronic pickups and is amplified.");
    }

    public void adjustVolume() {
        System.out.println("Adjusting the volume on the electric harp.");
    }
}
