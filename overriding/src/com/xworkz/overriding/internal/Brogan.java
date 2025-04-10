package com.xworkz.overriding.internal;

public class Brogan extends Bread{
    public Brogan() {
        System.out.println("Brogan constructor");
    }

    @Override
    public void describe() {
        System.out.println("Brogan is a bakery-themed shoe made for bakers.");
    }

    public void wear() {
        System.out.println("Wearing brogans while baking fresh loaves.");
    }
}
