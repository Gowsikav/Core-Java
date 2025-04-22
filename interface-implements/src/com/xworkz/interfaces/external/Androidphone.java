package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Smartphone;

public class Androidphone implements Smartphone {

    @Override
    public void makeCall(String number) {
        System.out.println("Making call to " + number);
    }

    @Override
    public void sendMessage(String number, String message) {
        System.out.println("Sending message to " + number + ": " + message);
    }

    @Override
    public void takePhoto() {
        System.out.println("Taking a photo with Androidphone");
    }

    @Override
    public void browseInternet(String website) {
        System.out.println("Browsing " + website + " on Androidphone");
    }

    @Override
    public void playMusic(String song) {
        System.out.println("Playing " + song + " on Androidphone");
    }
}
