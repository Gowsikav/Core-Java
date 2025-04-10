package com.xworkz.overriding.internal;

public class Briefs extends Boat1{
    public Briefs() {
        System.out.println("Briefs constructor");
    }

    @Override
    public void describe() {
        System.out.println("These briefs are designed for marine activities — quick dry and comfy.");
    }

    public void wear() {
        System.out.println("Wearing the boat-friendly briefs and heading for a swim.");
    }
}
