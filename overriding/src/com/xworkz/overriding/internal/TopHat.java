package com.xworkz.overriding.internal;

public class TopHat extends Hat{
    public TopHat() {
        System.out.println("TopHat constructor");
    }

    @Override
    public void describe() {
        System.out.println("A top hat is a tall, flat-crowned hat, often worn in formal occasions.");
    }

    public void adjustFit() {
        System.out.println("Adjusting the fit of the top hat.");
    }

}
