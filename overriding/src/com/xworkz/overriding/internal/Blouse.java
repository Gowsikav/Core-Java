package com.xworkz.overriding.internal;

public class Blouse extends Bed{
    public Blouse() {
        System.out.println("Blouse constructor");
    }

    @Override
    public void describe() {
        System.out.println("This blouse is part of a bedtime fashion collection.");
    }

    public void wear() {
        System.out.println("Wearing the comfy blouse to lounge in bed.");
    }
}
