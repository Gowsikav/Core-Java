package com.xworkz.overriding.internal;

public class Boots1 extends Bodega{
    public Boots1() {
        System.out.println("Boots constructor");
    }

    @Override
    public void describe() {
        System.out.println("These boots are tough, stylish, and sold at your local bodega.");
    }

    public void laceUp() {
        System.out.println("Lacing up the boots for a day of adventure.");
    }
}
