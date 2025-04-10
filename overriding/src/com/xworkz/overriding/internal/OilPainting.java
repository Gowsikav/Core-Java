package com.xworkz.overriding.internal;

public class OilPainting extends Art{
    public OilPainting() {
        System.out.println("OilPainting constructor");
    }

    @Override
    public void describe() {
        System.out.println("OilPainting uses oil-based pigments for rich color and texture.");
    }

    public void frameIt() {
        System.out.println("Framing the oil painting to prepare it for display.");
    }
}
