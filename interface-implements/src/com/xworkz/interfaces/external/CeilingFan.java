package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Fan;

public class CeilingFan implements Fan {

    @Override
    public void turnOn() {
        System.out.println("CeilingFan is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("CeilingFan is turned off");
    }

    @Override
    public void setSpeed(int level) {
        System.out.println("CeilingFan speed set to level " + level);
    }
}
