package com.xworkz.overriding.internal;

public class CementBrick extends Brick{
    public CementBrick() {
        System.out.println("CementBrick constructor");
    }

    @Override
    public void describe() {
        System.out.println("A cement brick is made of cement and is commonly used for building walls.");
    }

    public void checkDurability() {
        System.out.println("Checking the durability of the cement brick.");
    }
}
