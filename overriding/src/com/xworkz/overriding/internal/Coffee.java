package com.xworkz.overriding.internal;

public class Coffee extends Beverage1{
    public Coffee() {
        System.out.println("Coffee constructor");
    }

    @Override
    public void describe() {
        System.out.println("Coffee is a popular hot drink made from roasted beans.");
    }

    public void addMilk() {
        System.out.println("Adding milk to make it a latte.");
    }
}
