package com.xworkz.overriding.internal;

public class CheeseBurger extends Hamburger{
    public CheeseBurger() {
        System.out.println("CheeseBurger constructor");
    }

    @Override
    public void describe() {
        System.out.println("A cheeseburger is a hamburger topped with a slice of cheese.");
    }

    public void addCheese() {
        System.out.println("Adding extra cheese to the cheeseburger.");
    }
}
