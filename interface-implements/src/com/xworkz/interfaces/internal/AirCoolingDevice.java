package com.xworkz.interfaces.internal;

public interface AirCoolingDevice {
    void turnOn();
    void turnOff();
    void setSpeed(int speed);
    void oscillate(boolean isOscillating);
    void changeDirection(String direction);
    void setTimer(int minutes);
    void increaseSpeed();
}
