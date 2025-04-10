package com.xworkz.overriding.internal;

public class Circle extends Shape{
    public Circle() {
        System.out.println("Circle constructor");
    }

    @Override
    public void describe() {
        System.out.println("This is a circle, a round shape.");
    }

    public void calculateArea() {
        System.out.println("Calculating area of the circle.");
    }
}
