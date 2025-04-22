package com.xworkz.interfaces.runner;

import com.xworkz.interfaces.external.SplitAC;
import com.xworkz.interfaces.internal.AirConditioner;

public class AirConditionerRunner {
    public static void main(String[] args) {
        AirConditioner airConditioner = new SplitAC();
        airConditioner.turnOn();
        airConditioner.setTemperature(22);
        airConditioner.setMode("Cool");
        airConditioner.setFanSpeed(3);
        airConditioner.setTimer(60);
        airConditioner.checkAirQuality();
        airConditioner.activateCooling();
        airConditioner.turnOff();

        SplitAC splitAC = new SplitAC();
        splitAC.turnOn();
        splitAC.setTemperature(18);
        splitAC.setMode("Heat");
        splitAC.setFanSpeed(2);
        splitAC.setTimer(30);
        splitAC.checkAirQuality();
        splitAC.activateHeating();
        splitAC.turnOff();
    }
}
