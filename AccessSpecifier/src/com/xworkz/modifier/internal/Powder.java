package com.xworkz.modifier.internal;

public class Powder
{
    public Powder() {
        System.out.println("Powder constructor");
    }

    public void apply() {
        System.out.println("public apply method in Powder");
    }

    private void refill() {
        System.out.println("private refill method in Powder");
    }

    void smell() {
        System.out.println("package-default smell method in Powder");
    }
}
