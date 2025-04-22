package com.xworkz.interfaces.internal;

public interface Lamp {
    void turnOn();
    void turnOff();
    void adjustBrightness(int level);
    void changeColor(String color);
    void blink(int times);
    void setTimer(int minutes);
    void reset();
}
