package com.xworkz.interfaces.runner;

import com.xworkz.interfaces.external.SpeakerSystem;
import com.xworkz.interfaces.internal.AudioDevice;

public class AudioDeviceRunner {
    public static void main(String[] args) {
        AudioDevice audioDevice = new SpeakerSystem();
        audioDevice.turnOn();
        audioDevice.increaseVolume();
        audioDevice.playSound("Rock Music");
        audioDevice.decreaseVolume();
        audioDevice.turnOff();

        SpeakerSystem speakerSystem = new SpeakerSystem();
        speakerSystem.turnOn();
        speakerSystem.increaseVolume();
        speakerSystem.playSound("Classical Music");
        speakerSystem.decreaseVolume();
        speakerSystem.turnOff();
    }
}
