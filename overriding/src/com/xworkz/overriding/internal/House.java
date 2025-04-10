package com.xworkz.overriding.internal;

public class House extends Building
{
    public House() {
        System.out.println("House constructor");
    }

    @Override
    public void describe() {
        System.out.println("This is a house, a residential building.");
    }

    public void live() {
        System.out.println("People live in the house.");
    }
}
