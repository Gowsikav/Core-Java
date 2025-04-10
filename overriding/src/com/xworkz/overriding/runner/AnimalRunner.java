package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Animal;
import com.xworkz.overriding.internal.Dog;

public class AnimalRunner
{
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.describe();
        Dog dog =new Dog();
        dog.describe();
        dog.bark();
        Animal animal1=new Dog();
        animal1.describe();
    }
}
