package com.xworkz.overriding.internal;

public class WinterHood extends Hood{
    public WinterHood() {
        System.out.println("WinterHood constructor");
    }

    @Override
    public void describe() {
        System.out.println("A winter hood is designed to keep you warm in cold weather.");
    }

    public void adjustTightness() {
        System.out.println("Adjusting the tightness of the winter hood for better warmth.");
    }
}
