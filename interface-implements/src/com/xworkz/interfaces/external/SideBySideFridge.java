package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Refrigerator;

public class SideBySideFridge implements Refrigerator {

    @Override
    public void turnOn() {
        System.out.println("SideBySideFridge is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("SideBySideFridge is turned off");
    }

    @Override
    public void setTemperature(int temperature) {
        System.out.println("SideBySideFridge temperature set to " + temperature + "°C");
    }

    @Override
    public void openDoor() {
        System.out.println("SideBySideFridge door opened");
    }

    @Override
    public void closeDoor() {
        System.out.println("SideBySideFridge door closed");
    }

    @Override
    public void activateFreezer() {
        System.out.println("SideBySideFridge freezer activated");
    }

    @Override
    public void defrost() {
        System.out.println("SideBySideFridge is defrosting");
    }

    @Override
    public void setTimer(int minutes) {
        System.out.println("SideBySideFridge timer set to " + minutes + " minutes");
    }

    @Override
    public void checkWaterFilter() {
        System.out.println("SideBySideFridge water filter checked");
    }
}
