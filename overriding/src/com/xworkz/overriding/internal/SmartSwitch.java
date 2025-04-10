package com.xworkz.overriding.internal;

public class SmartSwitch extends Switch{
    public SmartSwitch() {
        System.out.println("SmartSwitch constructor");
    }

    @Override
    public void describe() {
        System.out.println("A SmartSwitch connects to Wi-Fi for remote control and scheduling.");
    }

    public void connectToApp() {
        System.out.println("SmartSwitch connected to mobile app for control.");
    }
}
