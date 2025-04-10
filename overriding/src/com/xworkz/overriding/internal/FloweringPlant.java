package com.xworkz.overriding.internal;

public class FloweringPlant extends Plant1{
    public FloweringPlant() {
        System.out.println("FloweringPlant constructor");
    }

    @Override
    public void describe() {
        System.out.println("A flowering plant produces beautiful flowers as part of its reproductive process.");
    }

    public void bloomFlowers() {
        System.out.println("The plant is blooming flowers!");
    }
}
