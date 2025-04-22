package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.AirCoolingDevice;

public class TowerFan implements AirCoolingDevice {

    @Override
    public void turnOn() {
        System.out.println("TowerFan is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("TowerFan is turned off");
    }

    @Override
    public void setSpeed(int speed) {
        System.out.println("TowerFan speed set to " + speed);
    }

    @Override
    public void oscillate(boolean isOscillating) {
        if (isOscillating) {
            System.out.println("TowerFan is oscillating");
        } else {
            System.out.println("TowerFan is not oscillating");
        }
    }

    @Override
    public void changeDirection(String direction) {
        System.out.println("TowerFan direction changed to " + direction);
    }

    @Override
    public void setTimer(int minutes) {
        System.out.println("TowerFan timer set to " + minutes + " minutes");
    }

    @Override
    public void increaseSpeed() {
        System.out.println("TowerFan speed increased");
    }
}
