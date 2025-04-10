package com.xworkz.overriding.internal;

public class Barge extends Batiste{
    public Barge() {
        System.out.println("Barge constructor");
    }

    @Override
    public void describe() {
        System.out.println("This barge is designed to transport luxurious fabrics like batiste.");
    }

    public void sail() {
        System.out.println("The fabric barge is sailing down the river.");
    }
}
