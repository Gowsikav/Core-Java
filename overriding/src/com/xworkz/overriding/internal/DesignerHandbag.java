package com.xworkz.overriding.internal;

public class DesignerHandbag extends Handbag1{
    public DesignerHandbag() {
        System.out.println("DesignerHandbag constructor");
    }

    @Override
    public void describe() {
        System.out.println("A designer handbag is a high-quality, luxury item with unique design.");
    }

    public void showBrand() {
        System.out.println("Showing the luxury brand of the designer handbag.");
    }
}
