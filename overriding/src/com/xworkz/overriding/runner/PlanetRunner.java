package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Earth;
import com.xworkz.overriding.internal.Planet;

public class PlanetRunner
{
    public static void main(String[] args) {
        Planet planet = new Planet();
        planet.describe();

        Earth earth = new Earth();
        earth.describe();
        earth.supportLife();

        Planet planet1 = new Earth();
        planet1.describe();
    }
}
