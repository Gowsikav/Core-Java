package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Speaker;

public class BluetoothSpeaker implements Speaker {

    @Override
    public void playSound() {
        System.out.println("Playing sound from BluetoothSpeaker");
    }
}
