package com.xworkz.interfaces.internal;

public interface WashingMachine {
    void turnOn();
    void turnOff();
    void startWashCycle();
    void startRinseCycle();
    void spinDry();
    void setWashTime(int minutes);
    void setWaterTemperature(String temperature);
    void addDetergent(String detergentType);
    void checkWaterLevel();
}
