package com.xworkz.interfaces.runner;

import com.xworkz.interfaces.external.SmartTV;
import com.xworkz.interfaces.internal.TV;

public class TVRunner {
    public static void main(String[] args) {
        TV tv = new SmartTV();
        tv.turnOn();
        tv.changeChannel(7);
        tv.turnOff();

        SmartTV smartTV = new SmartTV();
        smartTV.turnOn();
        smartTV.changeChannel(10);
        smartTV.turnOff();
    }
}
