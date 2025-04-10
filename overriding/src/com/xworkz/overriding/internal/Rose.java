package com.xworkz.overriding.internal;

public class Rose extends Plant{
    public Rose() {
        System.out.println("Rose constructor");
    }

    @Override
    public void describe() {
        System.out.println("This is a rose, a flowering plant.");
    }

    public void smell() {
        System.out.println("Smelling the sweet fragrance of the rose.");
    }
}
