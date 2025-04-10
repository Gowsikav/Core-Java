package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Satellite;
import com.xworkz.overriding.internal.Spacecraft;

public class SpacecraftRunner {
    public static void main(String[] args) {
        Spacecraft genericCraft = new Spacecraft();
        genericCraft.describe();

        Satellite geoSat = new Satellite();
        geoSat.describe();
        geoSat.transmitSignal();

        Spacecraft nasaDevice = new Satellite();
        nasaDevice.describe();
    }
}
