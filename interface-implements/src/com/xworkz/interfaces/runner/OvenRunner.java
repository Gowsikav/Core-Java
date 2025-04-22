package com.xworkz.interfaces.runner;

import com.xworkz.interfaces.external.Convection;
import com.xworkz.interfaces.internal.Oven;

public class OvenRunner {
    public static void main(String[] args) {
        Oven oven = new Convection();
        oven.turnOn();
        oven.setTemperature(180);
        oven.setTimer(30);
        oven.startBaking();
        oven.preheat();
        oven.checkCookingProgress();
        oven.stopCooking();
        oven.turnOff();

        Convection convectionOven = new Convection();
        convectionOven.turnOn();
        convectionOven.setTemperature(200);
        convectionOven.setTimer(45);
        convectionOven.startGrilling();
        convectionOven.preheat();
        convectionOven.checkCookingProgress();
        convectionOven.stopCooking();
        convectionOven.turnOff();
    }
}
