package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.WashingMachine;

public class FrontLoadWasher implements WashingMachine {

    @Override
    public void turnOn() {
        System.out.println("FrontLoadWasher is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("FrontLoadWasher is turned off");
    }

    @Override
    public void startWashCycle() {
        System.out.println("FrontLoadWasher is starting the wash cycle");
    }

    @Override
    public void startRinseCycle() {
        System.out.println("FrontLoadWasher is starting the rinse cycle");
    }

    @Override
    public void spinDry() {
        System.out.println("FrontLoadWasher is spinning the clothes dry");
    }

    @Override
    public void setWashTime(int minutes) {
        System.out.println("FrontLoadWasher wash time set to " + minutes + " minutes");
    }

    @Override
    public void setWaterTemperature(String temperature) {
        System.out.println("FrontLoadWasher water temperature set to " + temperature);
    }

    @Override
    public void addDetergent(String detergentType) {
        System.out.println("FrontLoadWasher detergent added: " + detergentType);
    }

    @Override
    public void checkWaterLevel() {
        System.out.println("FrontLoadWasher checking water level");
    }
}
