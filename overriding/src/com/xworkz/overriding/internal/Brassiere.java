package com.xworkz.overriding.internal;

public class Brassiere extends Bin {
    public Brassiere() {
        System.out.println("Brassiere constructor");
    }

    @Override
    public void describe() {
        System.out.println("This brassiere is designed with both comfort and support in mind.");
    }

    public void fold() {
        System.out.println("Folding and storing the brassiere neatly in the drawer.");
    }
}
