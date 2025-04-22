package com.xworkz.interfaces.runner;

import com.xworkz.interfaces.external.FrontLoadWasher;
import com.xworkz.interfaces.internal.WashingMachine;

public class WashingMachineRunner {
    public static void main(String[] args) {
        WashingMachine washingMachine = new FrontLoadWasher();
        washingMachine.turnOn();
        washingMachine.startWashCycle();
        washingMachine.startRinseCycle();
        washingMachine.spinDry();
        washingMachine.setWashTime(45);
        washingMachine.setWaterTemperature("Warm");
        washingMachine.addDetergent("Powder");
        washingMachine.checkWaterLevel();
        washingMachine.turnOff();

        FrontLoadWasher frontLoadWasher = new FrontLoadWasher();
        frontLoadWasher.turnOn();
        frontLoadWasher.startWashCycle();
        frontLoadWasher.startRinseCycle();
        frontLoadWasher.spinDry();
        frontLoadWasher.setWashTime(30);
        frontLoadWasher.setWaterTemperature("Cold");
        frontLoadWasher.addDetergent("Liquid");
        frontLoadWasher.checkWaterLevel();
        frontLoadWasher.turnOff();
    }
}
