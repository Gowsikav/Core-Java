package com.xworkz.overriding.internal;

public class Banister extends Butter{
    public Banister() {
        System.out.println("Banister constructor");
    }

    @Override
    public void describe() {
        System.out.println("This banister is polished so smooth, it's like butter.");
    }

    public void slide() {
        System.out.println("Sliding down the buttery-smooth banister!");
    }
}
