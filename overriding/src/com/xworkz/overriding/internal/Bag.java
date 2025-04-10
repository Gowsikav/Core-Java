package com.xworkz.overriding.internal;

public class Bag extends BokChoy{
    public Bag() {
        System.out.println("Bag constructor");
    }

    @Override
    public void describe() {
        System.out.println("This bag is designed to keep Bok Choy fresh during transport.");
    }

    public void carry() {
        System.out.println("Carrying Bok Choy safely in the freshness bag.");
    }
}
