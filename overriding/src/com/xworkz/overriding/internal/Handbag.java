package com.xworkz.overriding.internal;

public class Handbag extends Bag1{
    public Handbag() {
        System.out.println("Handbag constructor");
    }

    @Override
    public void describe() {
        System.out.println("A handbag is a small bag carried by hand or over the shoulder.");
    }

    public void open() {
        System.out.println("Opening the handbag.");
    }
}
