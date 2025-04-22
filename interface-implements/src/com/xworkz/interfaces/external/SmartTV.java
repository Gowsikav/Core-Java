package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.TV;

public class SmartTV implements TV {

    @Override
    public void turnOn() {
        System.out.println("SmartTV is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("SmartTV is turned off");
    }

    @Override
    public void changeChannel(int channel) {
        System.out.println("SmartTV channel changed to " + channel);
    }
}
