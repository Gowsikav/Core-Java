package com.xworkz.interfaces.runner;

import com.xworkz.interfaces.external.TowerFan;
import com.xworkz.interfaces.internal.AirCoolingDevice;

public class AirCoolingDeviceRunner {
    public static void main(String[] args) {
        AirCoolingDevice airCoolingDevice = new TowerFan();
        airCoolingDevice.turnOn();
        airCoolingDevice.setSpeed(3);
        airCoolingDevice.oscillate(true);
        airCoolingDevice.changeDirection("Clockwise");
        airCoolingDevice.setTimer(10);
        airCoolingDevice.increaseSpeed();
        airCoolingDevice.turnOff();

        TowerFan towerFan = new TowerFan();
        towerFan.turnOn();
        towerFan.setSpeed(5);
        towerFan.oscillate(false);
        towerFan.changeDirection("Counterclockwise");
        towerFan.setTimer(15);
        towerFan.increaseSpeed();
        towerFan.turnOff();
    }
}
