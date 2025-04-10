package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Circle;
import com.xworkz.overriding.internal.Shape;

public class ShapeRunner
{
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.describe();

        Circle circle = new Circle();
        circle.describe();
        circle.calculateArea();

        Shape shape1 = new Circle();
        shape1.describe();
    }
}
