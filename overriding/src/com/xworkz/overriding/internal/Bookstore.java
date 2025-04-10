package com.xworkz.overriding.internal;

public class Bookstore extends Butterfly{
    public Bookstore() {
        System.out.println("Bookstore constructor");
    }

    @Override
    public void describe() {
        System.out.println("This bookstore is themed with butterflies and nature.");
    }

    public void openStore() {
        System.out.println("Opening the butterfly-themed bookstore for customers.");
    }
}
