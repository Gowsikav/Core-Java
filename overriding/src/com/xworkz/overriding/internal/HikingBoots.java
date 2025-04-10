package com.xworkz.overriding.internal;

public class HikingBoots extends Footwear{
    public HikingBoots() {
        System.out.println("HikingBoots constructor");
    }

    @Override
    public void describe() {
        System.out.println("HikingBoots provide grip and ankle support for rugged trails.");
    }

    public void laceUp() {
        System.out.println("Lacing up the hiking boots for a safe trek.");
    }
}
