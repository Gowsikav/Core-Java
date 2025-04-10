package com.xworkz.overriding.internal;

public class Vacuum extends Cleaner1{
    public Vacuum() {
        System.out.println("VacuumCleaner constructor");
    }

    @Override
    public void describe() {
        System.out.println("A vacuum cleaner uses suction to clean floors and surfaces.");
    }

    public void emptyDustBag() {
        System.out.println("Emptying the vacuum cleaner dust bag.");
    }
}
