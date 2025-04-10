package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.HybridTruck;
import com.xworkz.overriding.internal.Transporter;

public class TransporterRunner
{
    public static void main(String[] args) {
        Transporter baseTruck = new Transporter();
        baseTruck.describe();

        HybridTruck cargoHauler = new HybridTruck();
        cargoHauler.describe();
        cargoHauler.loadCargo();

        Transporter mixedPower = new HybridTruck();
        mixedPower.describe();
    }
}
