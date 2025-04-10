package com.xworkz.overriding.internal;

public class ChocolateDonut extends Donut{
    public ChocolateDonut() {
        System.out.println("ChocolateDonut constructor");
    }

    @Override
    public void describe() {
        System.out.println("A chocolate donut is a donut topped with chocolate icing.");
    }

    public void addSprinkles() {
        System.out.println("Adding colorful sprinkles to the chocolate donut.");
    }
}
