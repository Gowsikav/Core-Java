package com.xworkz.overriding.internal;

public class Pizza extends Food{
    public Pizza() {
        System.out.println("Pizza constructor");
    }

    @Override
    public void describe() {
        System.out.println("This is a pizza, a popular Italian dish.");
    }

    public void eat() {
        System.out.println("Eating the pizza.");
    }
}
