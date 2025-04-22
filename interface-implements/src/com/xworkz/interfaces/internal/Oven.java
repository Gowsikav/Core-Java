package com.xworkz.interfaces.internal;

public interface Oven {
    void turnOn();
    void turnOff();
    void setTemperature(int temperature);
    void setTimer(int minutes);
    void startBaking();
    void startGrilling();
    void preheat();
    void stopCooking();
    void checkCookingProgress();
}
