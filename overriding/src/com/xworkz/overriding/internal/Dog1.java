package com.xworkz.overriding.internal;

public class Dog1 extends Pet{
    public Dog1() {
        System.out.println("Dog constructor");
    }

    @Override
    public void describe() {
        System.out.println("A dog is a domesticated carnivorous mammal and a loyal companion.");
    }

    public void bark() {
        System.out.println("The dog barks.");
    }
}
