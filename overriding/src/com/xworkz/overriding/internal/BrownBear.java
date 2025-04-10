package com.xworkz.overriding.internal;

public class BrownBear extends Badge{
    public BrownBear() {
        System.out.println("BrownBear constructor");
    }

    @Override
    public void describe() {
        System.out.println("This badge features a brown bear — it's for forest rangers.");
    }

    public void growl() {
        System.out.println("The brown bear growls proudly on the badge emblem.");
    }
}
