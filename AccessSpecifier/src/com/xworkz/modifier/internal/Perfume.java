package com.xworkz.modifier.internal;

public class Perfume
{
    public Perfume() {
        System.out.println("Perfume constructor");
    }

    public void spray() {
        System.out.println("public spray method in Perfume");
    }

    private void sealBottle() {
        System.out.println("private sealBottle method in Perfume");
    }

    void scentType() {
        System.out.println("package-default scentType method in Perfume");
    }
}
