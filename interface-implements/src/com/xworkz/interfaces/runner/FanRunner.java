package com.xworkz.interfaces.runner;

import com.xworkz.interfaces.external.CeilingFan;
import com.xworkz.interfaces.internal.Fan;

public class FanRunner {
    public static void main(String[] args) {
        Fan fan = new CeilingFan();
        fan.turnOn();
        fan.setSpeed(3);
        fan.turnOff();

        CeilingFan ceilingFan = new CeilingFan();
        ceilingFan.turnOn();
        ceilingFan.setSpeed(2);
        ceilingFan.turnOff();
    }
}
