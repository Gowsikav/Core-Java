package com.xworkz.overriding.internal;

public class FoamMattress extends AirMattress{
    public FoamMattress() {
        System.out.println("FoamMattress constructor");
    }

    @Override
    public void describe() {
        System.out.println("A foam mattress provides support with layers of foam.");
    }

    public void adjustFirmness() {
        System.out.println("Adjusting the foam layers for personalized comfort.");
    }
}
