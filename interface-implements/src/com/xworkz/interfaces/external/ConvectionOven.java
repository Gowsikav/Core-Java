package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.CookingAppliance;

public class ConvectionOven implements CookingAppliance {

    @Override
    public void startCooking() {
        System.out.println("ConvectionOven has started cooking");
    }

    @Override
    public void stopCooking() {
        System.out.println("ConvectionOven has stopped cooking");
    }

    @Override
    public void setTimer(int minutes) {
        System.out.println("ConvectionOven timer set to " + minutes + " minutes");
    }

    @Override
    public void defrost() {
        System.out.println("ConvectionOven is defrosting");
    }

    @Override
    public void setPowerLevel(int level) {
        System.out.println("ConvectionOven power level set to " + level);
    }

    @Override
    public void preheat() {
        System.out.println("ConvectionOven is preheating");
    }

    @Override
    public void cancelOperation() {
        System.out.println("ConvectionOven operation has been canceled");
    }
}
