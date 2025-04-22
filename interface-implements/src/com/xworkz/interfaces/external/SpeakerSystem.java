package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.AudioDevice;

public class SpeakerSystem implements AudioDevice {

    @Override
    public void turnOn() {
        System.out.println("SpeakerSystem is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("SpeakerSystem is turned off");
    }

    @Override
    public void increaseVolume() {
        System.out.println("SpeakerSystem volume increased");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("SpeakerSystem volume decreased");
    }

    @Override
    public void playSound(String sound) {
        System.out.println("SpeakerSystem is playing sound: " + sound);
    }
}
