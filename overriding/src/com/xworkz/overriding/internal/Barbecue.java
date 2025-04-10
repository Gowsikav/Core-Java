package com.xworkz.overriding.internal;

public class Barbecue extends Bee{
    public Barbecue() {
        System.out.println("Barbecue constructor");
    }

    @Override
    public void describe() {
        System.out.println("Barbecue spot styled like a beehive, famous for its honey-glazed ribs.");
    }

    public void grill() {
        System.out.println("Grilling with honey — bees would approve!");
    }
}
