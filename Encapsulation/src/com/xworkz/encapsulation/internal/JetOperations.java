package com.xworkz.encapsulation.internal;

public class JetOperations
{
    Jet jet;

    public JetOperations(Jet jet) {
        this.jet = jet;
        System.out.println("JetOperations Constructor");
    }

    public void configure() {
        jet.setModel("F-22 Raptor");
        jet.setSpeed(2410.0);
        jet.setCapacity(1);
        jet.setMilitary(true);
        jet.setManufacturer("Lockheed Martin");

        System.out.println("Model: " + jet.getModel());
        System.out.println("Speed: " + jet.getSpeed());
        System.out.println("Capacity: " + jet.getCapacity());
        System.out.println("Military: " + jet.isMilitary());
        System.out.println("Manufacturer: " + jet.getManufacturer());
    }
}
