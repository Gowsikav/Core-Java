package com.xworkz.encapsulation.external;

import com.xworkz.encapsulation.internal.Jet;

public class JetReview
{
    Jet jet;

    public JetReview(Jet jet) {
        this.jet = jet;
        System.out.println("JetReview Constructor");
    }

    public void review() {
        System.out.println("Model: " + jet.getModel());
        System.out.println("Speed: " + jet.getSpeed());
        System.out.println("Capacity: " + jet.getCapacity());
        System.out.println("Military: " + jet.isMilitary());
        System.out.println("Manufacturer: " + jet.getManufacturer());
    }
}
