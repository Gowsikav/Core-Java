package com.xworkz.overriding.internal;

public class Bikini extends Boucle{
    public Bikini() {
        System.out.println("Bikini constructor");
    }

    @Override
    public void describe() {
        System.out.println("This bikini is crafted from soft and durable boucle fabric.");
    }

    public void swim() {
        System.out.println("Swimming comfortably in a boucle bikini!");
    }
}
