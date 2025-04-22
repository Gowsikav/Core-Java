package com.xworkz.interfaces.runner;

import com.xworkz.interfaces.external.ConvectionOven;
import com.xworkz.interfaces.internal.CookingAppliance;

public class CookingApplianceRunner {
    public static void main(String[] args) {
        CookingAppliance appliance = new ConvectionOven();
        appliance.startCooking();
        appliance.setTimer(5);
        appliance.defrost();
        appliance.setPowerLevel(8);
        appliance.preheat();
        appliance.cancelOperation();
        appliance.stopCooking();

        ConvectionOven convectionOven = new ConvectionOven();
        convectionOven.startCooking();
        convectionOven.setTimer(10);
        convectionOven.defrost();
        convectionOven.setPowerLevel(6);
        convectionOven.preheat();
        convectionOven.cancelOperation();
        convectionOven.stopCooking();
    }
}
