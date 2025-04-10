package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Engine;
import com.xworkz.overriding.internal.VehiclePart;

public class VehiclePartRunner {
    public static void main(String[] args) {
        VehiclePart part = new VehiclePart();
        part.describe();

        Engine engine = new Engine();
        engine.describe();
        engine.start();

        VehiclePart part1 = new Engine();
        part1.describe();
    }
}
