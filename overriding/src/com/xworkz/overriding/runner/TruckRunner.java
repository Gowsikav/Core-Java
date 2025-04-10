package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.ElectricTruck;
import com.xworkz.overriding.internal.Truck;

public class TruckRunner {
    public static void main(String[] args) {
        Truck basicTruck = new Truck();
        basicTruck.describe();

        ElectricTruck ecoTruck = new ElectricTruck();
        ecoTruck.describe();
        ecoTruck.chargeBattery();

        Truck electricVehicle = new ElectricTruck();
        electricVehicle.describe();
    }
}
