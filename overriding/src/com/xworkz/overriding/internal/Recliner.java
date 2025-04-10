package com.xworkz.overriding.internal;

public class Recliner extends Armchair{
    public Recliner() {
        System.out.println("Recliner constructor");
    }

    @Override
    public void describe() {
        System.out.println("A recliner is an armchair that leans back and often has a footrest.");
    }

    public void adjustPosition() {
        System.out.println("Adjusting the recliner to your favorite position.");
    }
}
