package com.xworkz.donkey.external;

import com.xworkz.donkey.internal.SmartDevice;

public class SmartPhone implements SmartDevice {

    public void turnOn() {
        System.out.println("Smartphone is turning on...");
    }

    public void turnOff() {
        System.out.println("Smartphone is shutting down...");
    }

    public void restart() {
        System.out.println("Smartphone is restarting...");
    }

    public void updateSoftware() {
        System.out.println("Updating software...");
    }

    public void connectToWiFi(String ssid) {
        System.out.println("Connecting to WiFi: " + ssid);
    }

    public void disconnectWiFi() {
        System.out.println("Disconnecting WiFi...");
    }

    public void showStatus() {
        System.out.println("Device is online with all features running");
    }

    public void resetSettings() {
        System.out.println("Resetting all settings to default");
    }

    public void increaseVolume() {
        System.out.println("Increasing volume");
    }

    public void decreaseVolume() {
        System.out.println("Decreasing volume");
    }
}
