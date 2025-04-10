package com.xworkz.overriding.internal;

public class CottonFabric extends Fabric{
    public CottonFabric() {
        System.out.println("CottonFabric constructor");
    }

    @Override
    public void describe() {
        System.out.println("CottonFabric is soft, breathable, and commonly used for clothing.");
    }

    public void washInstructions() {
        System.out.println("Wash in cold water and avoid bleach to preserve softness.");
    }
}
