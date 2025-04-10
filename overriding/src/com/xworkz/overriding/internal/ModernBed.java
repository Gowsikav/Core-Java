package com.xworkz.overriding.internal;

public class ModernBed extends Furniture1{
    public ModernBed() {
        System.out.println("ModernBed constructor");
    }

    @Override
    public void describe() {
        System.out.println("ModernBed has a sleek design with storage and lighting features.");
    }

    public void enableLights() {
        System.out.println("Under-bed lights are now ON.");
    }
}
