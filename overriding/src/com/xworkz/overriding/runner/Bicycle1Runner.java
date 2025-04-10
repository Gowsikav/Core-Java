package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Bicycle1;
import com.xworkz.overriding.internal.MountainBike;

public class Bicycle1Runner {
    public static void main(String[] args) {
        Bicycle1 regularBike = new Bicycle1();
        regularBike.describe();

        MountainBike ruggedBike = new MountainBike();
        ruggedBike.describe();
        ruggedBike.addSuspension();

        Bicycle1 mountainCycler = new MountainBike();
        mountainCycler.describe();
    }
}
