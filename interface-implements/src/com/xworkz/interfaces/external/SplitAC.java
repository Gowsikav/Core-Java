package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.AirConditioner;

public class SplitAC implements AirConditioner {

    @Override
    public void turnOn() {
        System.out.println("SplitAC is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("SplitAC is turned off");
    }

    @Override
    public void setTemperature(int temperature) {
        System.out.println("SplitAC temperature set to " + temperature + "°C");
    }

    @Override
    public void setMode(String mode) {
        System.out.println("SplitAC mode set to " + mode);
    }

    @Override
    public void setFanSpeed(int speed) {
        System.out.println("SplitAC fan speed set to " + speed);
    }

    @Override
    public void setTimer(int minutes) {
        System.out.println("SplitAC timer set to " + minutes + " minutes");
    }

    @Override
    public void checkAirQuality() {
        System.out.println("SplitAC air quality is optimal");
    }

    @Override
    public void activateCooling() {
        System.out.println("SplitAC cooling activated");
    }

    @Override
    public void activateHeating() {
        System.out.println("SplitAC heating activated");
    }
}
