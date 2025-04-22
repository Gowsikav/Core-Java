package com.xworkz.interfaces.internal;

public interface Blender {
    void turnOn();
    void turnOff();
    void setSpeedLevel(int level);
    void setTimer(int minutes);
    void startBlending();
    void stopBlending();
    void addIngredients(String ingredient);
    void checkBlendStatus();
    void setMode(String mode);
}
