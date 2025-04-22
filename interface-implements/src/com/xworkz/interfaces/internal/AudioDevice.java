package com.xworkz.interfaces.internal;

public interface AudioDevice {
    void turnOn();
    void turnOff();
    void increaseVolume();
    void decreaseVolume();
    void playSound(String sound);
}
