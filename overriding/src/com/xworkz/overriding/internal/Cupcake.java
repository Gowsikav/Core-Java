package com.xworkz.overriding.internal;

public class Cupcake extends Dessert{
    public Cupcake() {
        System.out.println("Cupcake constructor");
    }

    @Override
    public void describe() {
        System.out.println("A cupcake is a small cake designed for one person.");
    }

    public void addFrosting() {
        System.out.println("Frosting added: Now it's both pretty and tasty!");
    }
}
