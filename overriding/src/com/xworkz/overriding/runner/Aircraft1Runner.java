package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.AirCraft1;
import com.xworkz.overriding.internal.Helicopter;

public class Aircraft1Runner {
    public static void main(String[] args) {
        AirCraft1 basicAircraft = new AirCraft1();
        basicAircraft.describe();

        Helicopter helicopter = new Helicopter();
        helicopter.describe();
        helicopter.hover();

        AirCraft1 flyingMachine = new Helicopter();
        flyingMachine.describe();
    }
}
