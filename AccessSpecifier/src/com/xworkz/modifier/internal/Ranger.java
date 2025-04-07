package com.xworkz.modifier.internal;

public class Ranger
{
    public Ranger() {
        System.out.println("Ranger constructor");
    }

    public void patrol() {
        System.out.println("running in patrol method");
        Forest forest = new Forest();
        forest.explore();
        forest.plantTrees();
    }
}
