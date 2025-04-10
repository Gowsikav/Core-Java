package com.xworkz.overriding.internal;

public class LuxuryRobe extends BathRobe1{
    public LuxuryRobe() {
        System.out.println("LuxuryRobe constructor");
    }

    @Override
    public void describe() {
        System.out.println("LuxuryRobe is made with premium fabric for spa-like comfort.");
    }

    public void warmUp() {
        System.out.println("Warming up the robe with a built-in heater.");
    }
}
