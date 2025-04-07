package com.xworkz.modifier.internal;

public class Coin
{
    public Coin() {
        System.out.println("Coin constructor");
    }

    public void flip() {
        System.out.println("public flip method in Coin");
    }

    private void polish() {
        System.out.println("private polish method in Coin");
    }

    void inspect() {
        System.out.println("package-default inspect method in Coin");
    }
}
