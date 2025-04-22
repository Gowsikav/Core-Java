package com.xworkz.interfaces.internal;

public interface CookingAppliance {
    void startCooking();
    void stopCooking();
    void setTimer(int minutes);
    void defrost();
    void setPowerLevel(int level);
    void preheat();
    void cancelOperation();
}
