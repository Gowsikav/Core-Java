package com.xworkz.overriding.internal;

public class BasketballStick extends HockeyStick1{
    public BasketballStick() {
        System.out.println("BasketballStick constructor");
    }

    @Override
    public void describe() {
        System.out.println("A basketball stick is used for the sport of basketball.");
    }

    public void checkGrip() {
        System.out.println("Checking the grip on the basketball stick.");
    }
}
