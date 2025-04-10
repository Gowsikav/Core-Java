package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Dog1;
import com.xworkz.overriding.internal.Pet;

public class PetRunner {
    public static void main(String[] args) {
        Pet basicPet = new Pet();
        basicPet.describe();

        Dog1 petDog = new Dog1();
        petDog.describe();
        petDog.bark();

        Pet dogPet = new Dog1();
        dogPet.describe();
    }
}
