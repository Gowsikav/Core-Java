package com.xworkz.interfaces.runner;

import com.xworkz.interfaces.external.SmartLight;
import com.xworkz.interfaces.internal.Light;

public class LightRunner {
    public static void main(String[] args) {
        Light light = new SmartLight();
        light.turnOn();

        SmartLight smartLight = new SmartLight();
        smartLight.turnOn();
    }
}
