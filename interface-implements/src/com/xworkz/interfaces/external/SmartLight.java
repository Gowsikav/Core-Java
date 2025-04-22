package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Light;

public class SmartLight implements Light {

    @Override
    public void turnOn() {
        System.out.println("Turning on the SmartLight");
    }
}
