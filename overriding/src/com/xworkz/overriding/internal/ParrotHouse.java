package com.xworkz.overriding.internal;

public class ParrotHouse extends Aviary{
    public ParrotHouse() {
        System.out.println("ParrotHouse constructor");
    }

    @Override
    public void describe() {
        System.out.println("A ParrotHouse is a special aviary designed for parrots.");
    }

    public void feedParrots() {
        System.out.println("Feeding fruits and seeds to the parrots.");
    }
}
