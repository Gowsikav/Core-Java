package com.xworkz.donkey.runner;

import com.xworkz.donkey.external.SmartPhone;
import com.xworkz.donkey.internal.SmartDevice;

public class SmartDeviceRunner {

    public static void main(String[] args) {
        System.out.println("=== Subclass Implementation ===");

        SmartDevice smartDevice = new SmartPhone();
        smartDevice.turnOn();
        smartDevice.connectToWiFi("HomeWiFi");
        smartDevice.increaseVolume();
        smartDevice.updateSoftware();
        smartDevice.showStatus();
        smartDevice.decreaseVolume();
        smartDevice.resetSettings();
        smartDevice.restart();
        smartDevice.turnOff();
        smartDevice.disconnectWiFi();

        smartDevice.displayBatteryLevel();
        smartDevice.enableBluetooth();
        smartDevice.disableBluetooth();
        smartDevice.takeScreenshot();
        smartDevice.openSettings();
        smartDevice.lockDevice();
        smartDevice.unlockDevice();
        smartDevice.enableDarkMode();
        smartDevice.disableDarkMode();
        smartDevice.checkStorage();

        SmartDevice.aboutDevice();
        SmartDevice.supportedLanguages();
        SmartDevice.showManufacturer();
        SmartDevice.showWarranty();
        SmartDevice.showLegalInfo();
        SmartDevice.getDeviceCategory();
        SmartDevice.getDeviceID();
        SmartDevice.getModelName();
        SmartDevice.isCompatibleWith5G();
        SmartDevice.getSecurityPatchDate();

        System.out.println("\n=== Anonymous Class Implementation ===");

        SmartDevice smartDevice2 = new SmartDevice() {
            public void turnOn() { 
                System.out.println("smartDevice2: turnOn");
            }
            public void turnOff() { 
                System.out.println("smartDevice2: turnOff");
            }
            public void restart() { 
                System.out.println("smartDevice2: restart");
            }
            public void updateSoftware() {
                System.out.println("smartDevice2: updateSoftware");
            }
            public void connectToWiFi(String ssid) {
                System.out.println("smartDevice2: Connecting to WiFi - " + ssid);
            }
            public void disconnectWiFi() { 
                System.out.println("smartDevice2: disconnectWiFi");
            }
            public void showStatus() { 
                System.out.println("smartDevice2: All systems go");
            }
            public void resetSettings() { 
                System.out.println("smartDevice2: resetSettings");
            }
            public void increaseVolume() { 
                System.out.println("smartDevice2: increaseVolume");
            }
            public void decreaseVolume() { 
                System.out.println("smartDevice2: decreaseVolume");
            }
        };

        smartDevice2.turnOn();
        smartDevice2.connectToWiFi("Cafe_WiFi");
        smartDevice2.increaseVolume();
        smartDevice2.updateSoftware();
        smartDevice2.showStatus();
        smartDevice2.decreaseVolume();
        smartDevice2.resetSettings();
        smartDevice2.restart();
        smartDevice2.turnOff();
        smartDevice2.disconnectWiFi();

        smartDevice2.displayBatteryLevel();
        smartDevice2.enableBluetooth();
        smartDevice2.disableBluetooth();
        smartDevice2.takeScreenshot();
        smartDevice2.openSettings();
        smartDevice2.lockDevice();
        smartDevice2.unlockDevice();
        smartDevice2.enableDarkMode();
        smartDevice2.disableDarkMode();
        smartDevice2.checkStorage();
    }
}

