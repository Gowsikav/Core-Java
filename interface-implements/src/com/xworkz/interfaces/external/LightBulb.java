package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Lamp;

public class LightBulb implements Lamp {

    @Override
    public void turnOn() {
        System.out.println("LightBulb is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("LightBulb is turned off");
    }

    @Override
    public void adjustBrightness(int level) {
        System.out.println("LightBulb brightness adjusted to level " + level);
    }

    @Override
    public void changeColor(String color) {
        System.out.println("LightBulb color changed to " + color);
    }

    @Override
    public void blink(int times) {
        System.out.println("LightBulb is blinking " + times + " times");
    }

    @Override
    public void setTimer(int minutes) {
        System.out.println("LightBulb timer set to " + minutes + " minutes");
    }

    @Override
    public void reset() {
        System.out.println("LightBulb has been reset");
    }
}
