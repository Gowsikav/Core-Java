package com.xworkz.interfaces.runner;

import com.xworkz.interfaces.external.SideBySideFridge;
import com.xworkz.interfaces.internal.Refrigerator;

public class RefrigeratorRunner {
    public static void main(String[] args) {
        Refrigerator refrigerator = new SideBySideFridge();
        refrigerator.turnOn();
        refrigerator.setTemperature(4);
        refrigerator.openDoor();
        refrigerator.activateFreezer();
        refrigerator.defrost();
        refrigerator.setTimer(30);
        refrigerator.checkWaterFilter();
        refrigerator.closeDoor();
        refrigerator.turnOff();

        SideBySideFridge sideBySideFridge = new SideBySideFridge();
        sideBySideFridge.turnOn();
        sideBySideFridge.setTemperature(2);
        sideBySideFridge.openDoor();
        sideBySideFridge.activateFreezer();
        sideBySideFridge.defrost();
        sideBySideFridge.setTimer(15);
        sideBySideFridge.checkWaterFilter();
        sideBySideFridge.closeDoor();
        sideBySideFridge.turnOff();
    }
}
