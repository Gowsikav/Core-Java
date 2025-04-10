package com.xworkz.overriding.internal;

public class Bandana extends Bullnose{
    public Bandana() {
        System.out.println("Bandana constructor");
    }

    @Override
    public void describe() {
        System.out.println("This bandana has a stylish bullnose finish — soft and rounded.");
    }

    public void tie() {
        System.out.println("Tying the bandana for a bold, confident look.");
    }
}
