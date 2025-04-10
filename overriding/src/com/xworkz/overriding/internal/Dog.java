package com.xworkz.overriding.internal;

public class Dog extends Animal
{
    public Dog()
    {
        System.out.println("Dog constructor");
    }
    public void describe() {
        System.out.println("This is a dog, a type of animal.");
    }

    public void bark() {
        System.out.println("The dog barks.");
    }
}
