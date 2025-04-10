package com.xworkz.overriding.internal;

public class Lemonade extends Drink{
    public Lemonade() {
        System.out.println("Lemonade constructor");
    }

    @Override
    public void describe() {
        System.out.println("Lemonade is a citrus drink made from lemons, water, and sugar.");
    }

    public void serveChilled() {
        System.out.println("Serving lemonade chilled with ice and mint.");
    }
}
