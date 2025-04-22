package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Oven;

public class Convection implements Oven {

    @Override
    public void turnOn() {
        System.out.println("ConvectionOven is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("ConvectionOven is turned off");
    }

    @Override
    public void setTemperature(int temperature) {
        System.out.println("ConvectionOven temperature set to " + temperature + "°C");
    }

    @Override
    public void setTimer(int minutes) {
        System.out.println("ConvectionOven timer set to " + minutes + " minutes");
    }

    @Override
    public void startBaking() {
        System.out.println("ConvectionOven is baking");
    }

    @Override
    public void startGrilling() {
        System.out.println("ConvectionOven is grilling");
    }

    @Override
    public void preheat() {
        System.out.println("ConvectionOven is preheating");
    }

    @Override
    public void stopCooking() {
        System.out.println("ConvectionOven has stopped cooking");
    }

    @Override
    public void checkCookingProgress() {
        System.out.println("ConvectionOven is checking cooking progress");
    }
}
