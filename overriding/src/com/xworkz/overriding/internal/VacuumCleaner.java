package com.xworkz.overriding.internal;

public class VacuumCleaner extends Cleaner{
    public VacuumCleaner() {
        System.out.println("VacuumCleaner constructor");
    }

    @Override
    public void describe() {
        System.out.println("VacuumCleaner sucks up dust and debris from surfaces.");
    }

    public void startSuction() {
        System.out.println("VacuumCleaner is running with high suction power.");
    }
}
