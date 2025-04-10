package com.xworkz.overriding.internal;

public class Brogue extends Bleach{
    public Brogue() {
        System.out.println("Brogue constructor");
    }

    @Override
    public void describe() {
        System.out.println("This is a stylish shoe with perforated patterns.");
    }

    public void polish() {
        System.out.println("Polishing the brogue shoes.");
    }
}
