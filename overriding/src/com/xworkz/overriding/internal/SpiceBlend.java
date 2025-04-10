package com.xworkz.overriding.internal;

public class SpiceBlend extends Allspice{
    public SpiceBlend() {
        System.out.println("SpiceBlend constructor");
    }

    @Override
    public void describe() {
        System.out.println("A spice blend combines multiple spices for a unique flavor profile.");
    }

    public void mixSpices() {
        System.out.println("Mixing spices into a flavorful blend.");
    }
}
