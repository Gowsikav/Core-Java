package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Boat;
import com.xworkz.overriding.internal.Broom;

public class BoatRunner
{
    public static void main(String[] args) {
        Boat boat = new Boat();
        boat.describe();

        Broom broomBoat = new Broom();
        broomBoat.describe();
        broomBoat.sweepWater();

        Boat boat1 = new Broom();
        boat1.describe();
    }
}
