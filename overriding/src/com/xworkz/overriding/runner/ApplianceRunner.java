package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Appliance;
import com.xworkz.overriding.internal.WashingMachine;

public class ApplianceRunner
{
    public static void main(String[] args) {
        Appliance appliance = new Appliance();
        appliance.describe();

        WashingMachine washingMachine = new WashingMachine();
        washingMachine.describe();
        washingMachine.wash();

        Appliance appliance1 = new WashingMachine();
        appliance1.describe();
    }
}
