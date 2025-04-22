package com.xworkz.interfaces.internal;

public interface Refrigerator {
    void turnOn();
    void turnOff();
    void setTemperature(int temperature);
    void openDoor();
    void closeDoor();
    void activateFreezer();
    void defrost();
    void setTimer(int minutes);
    void checkWaterFilter();
}
