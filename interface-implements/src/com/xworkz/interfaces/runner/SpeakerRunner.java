package com.xworkz.interfaces.runner;

import com.xworkz.interfaces.external.BluetoothSpeaker;
import com.xworkz.interfaces.internal.Speaker;

public class SpeakerRunner {
    public static void main(String[] args) {
        Speaker speaker = new BluetoothSpeaker();
        speaker.playSound();

        BluetoothSpeaker bluetoothSpeaker = new BluetoothSpeaker();
        bluetoothSpeaker.playSound();
    }
}
