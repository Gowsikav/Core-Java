package com.xworkz.overriding.internal;

public class SolarPoweredBus extends Transport{
    public SolarPoweredBus() {
        System.out.println("SolarPoweredBus constructor");
    }

    @Override
    public void describe() {
        System.out.println("SolarPoweredBus uses solar energy to move without emissions.");
    }

    public void deployPanels() {
        System.out.println("Deploying solar panels to harness sunlight.");
    }
}
