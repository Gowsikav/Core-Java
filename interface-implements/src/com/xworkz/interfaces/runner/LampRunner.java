package com.xworkz.interfaces.runner;

import com.xworkz.interfaces.external.LightBulb;
import com.xworkz.interfaces.internal.Lamp;

public class LampRunner {
    public static void main(String[] args) {
        Lamp lamp = new LightBulb();
        lamp.turnOn();
        lamp.adjustBrightness(5);
        lamp.changeColor("Blue");
        lamp.blink(3);
        lamp.setTimer(10);
        lamp.reset();
        lamp.turnOff();

        LightBulb lightBulb = new LightBulb();
        lightBulb.turnOn();
        lightBulb.adjustBrightness(7);
        lightBulb.changeColor("Red");
        lightBulb.blink(2);
        lightBulb.setTimer(15);
        lightBulb.reset();
        lightBulb.turnOff();
    }
}
