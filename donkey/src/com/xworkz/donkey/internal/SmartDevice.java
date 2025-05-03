package com.xworkz.donkey.internal;

public interface SmartDevice {

    void turnOn();
    void turnOff();
    void restart();
    void updateSoftware();
    void connectToWiFi(String ssid);
    void disconnectWiFi();
    void showStatus();
    void resetSettings();
    void increaseVolume();
    void decreaseVolume();

    default void displayBatteryLevel() {
        System.out.println("Battery level is at 80%");
    }

    default void enableBluetooth() {
        System.out.println("Bluetooth enabled");
    }

    default void disableBluetooth() {
        System.out.println("Bluetooth disabled");
    }

    default void takeScreenshot() {
        System.out.println("Screenshot taken");
    }

    default void openSettings() {
        System.out.println("Opening settings");
    }

    default void lockDevice() {
        System.out.println("Device locked");
    }

    default void unlockDevice() {
        System.out.println("Device unlocked");
    }

    default void enableDarkMode() {
        System.out.println("Dark mode enabled");
    }

    default void disableDarkMode() {
        System.out.println("Dark mode disabled");
    }

    default void checkStorage() {
        System.out.println("Available storage: 32GB");
    }

    static void aboutDevice() {
        System.out.println("SmartDevice v1.0");
    }

    static void supportedLanguages() {
        System.out.println("Supports English, Spanish, French");
    }

    static void showManufacturer() {
        System.out.println("Manufactured by TechCorp");
    }

    static void showWarranty() {
        System.out.println("Warranty: 2 years");
    }

    static void showLegalInfo() {
        System.out.println("All rights reserved.");
    }

    static void getDeviceCategory() {
        System.out.println("Category: IoT Device");
    }

    static void getDeviceID() {
        System.out.println("Device ID: 1234-5678");
    }

    static void getModelName() {
        System.out.println("Model: SmartX 2025");
    }

    static void isCompatibleWith5G() {
        System.out.println("5G Compatible: Yes");
    }

    static void getSecurityPatchDate() {
        System.out.println("Security Patch: March 2025");
    }
}
