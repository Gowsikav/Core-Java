package com.xworkz.interfaces.internal;

public interface AirConditioner {
    void turnOn();
    void turnOff();
    void setTemperature(int temperature);
    void setMode(String mode);
    void setFanSpeed(int speed);
    void setTimer(int minutes);
    void checkAirQuality();
    void activateCooling();
    void activateHeating();
}
