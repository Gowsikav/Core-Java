package com.xworkz.overriding.internal;

public class Berries extends Bathrobe{
    public Berries() {
        System.out.println("Berries constructor");
    }

    @Override
    public void describe() {
        System.out.println("This bathrobe has a beautiful berry pattern on soft fabric.");
    }

    public void smellFresh() {
        System.out.println("Smells like fresh strawberries – perfect post-shower feels.");
    }
}
