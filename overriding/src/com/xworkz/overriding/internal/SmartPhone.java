package com.xworkz.overriding.internal;

public class SmartPhone extends Device
{
    public SmartPhone() {
        System.out.println("Smartphone constructor");
    }

    @Override
    public void describe() {
        System.out.println("This is a smartphone, an advanced electronic device.");
    }

    public void browseInternet() {
        System.out.println("Browsing the internet on the smartphone.");
    }
}
