package com.xworkz.overriding.internal;

public class Shirt extends Clothing
{
    public Shirt() {
        System.out.println("Shirt constructor");
    }

    @Override
    public void describe() {
        System.out.println("This is a shirt, a formal piece of clothing.");
    }

    public void wear() {
        System.out.println("Wearing the shirt.");
    }
}
