package com.xworkz.modifier.external;

import com.xworkz.modifier.internal.Forest;

public class Camper
{
    public Camper() {
        System.out.println("Camper constructor");
    }

    public void hike() {
        System.out.println("running in hike method");
        Forest forest = new Forest();
        forest.explore();
    }
}
