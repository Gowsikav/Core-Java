package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Aviary;
import com.xworkz.overriding.internal.ParrotHouse;

public class AviaryRunner {
    public static void main(String[] args) {
        Aviary aviary = new Aviary();
        aviary.describe();

        ParrotHouse parrotZone = new ParrotHouse();
        parrotZone.describe();
        parrotZone.feedParrots();

        Aviary tropicalBirds = new ParrotHouse();
        tropicalBirds.describe();
    }
}
