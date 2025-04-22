package com.xworkz.interfaces.runner;

import com.xworkz.interfaces.external.Androidphone;
import com.xworkz.interfaces.internal.Smartphone;

public class SmartphoneRunner {
    public static void main(String[] args) {
        Smartphone smartphone = new Androidphone();
        smartphone.makeCall("123456789");
        smartphone.sendMessage("123456789", "Hello!");
        smartphone.takePhoto();
        smartphone.browseInternet("www.google.com");
        smartphone.playMusic("Shape of You");

        Androidphone androidPhone = new Androidphone();
        androidPhone.makeCall("987654321");
        androidPhone.sendMessage("987654321", "Hi!");
        androidPhone.takePhoto();
        androidPhone.browseInternet("www.youtube.com");
        androidPhone.playMusic("Blinding Lights");
    }
}
