package com.xworkz.overriding.internal;

public class Apple extends Fruit{
    public Apple()
    {
        System.out.println("Apple constructor");
    }
   @Override
    public void describe() {
        System.out.println("A fruit is the mature ovary of a flowering plant, typically containing seeds.");
    }
    public void sweeter()
    {
        System.out.println("Apple is fruit");
    }
}
