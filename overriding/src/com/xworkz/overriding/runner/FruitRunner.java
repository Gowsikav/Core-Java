package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Apple;
import com.xworkz.overriding.internal.Fruit;

public class FruitRunner {
    public static void main(String[] args) {
        Fruit fruit=new Fruit();
        fruit.describe();

        Apple apple=new Apple();
        apple.describe();
        apple.sweeter();

        Fruit fruit1=new Apple();
        fruit1.describe();
    }
}
