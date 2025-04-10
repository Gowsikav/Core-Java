package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Saxophone;
import com.xworkz.overriding.internal.SoundDevice;

public class SounddeviceRunner {
    public static void main(String[] args) {
        SoundDevice device = new SoundDevice();
        device.describe();

        Saxophone jazzSax = new Saxophone();
        jazzSax.describe();
        jazzSax.playJazz();

        SoundDevice smoothTune = new Saxophone();
        smoothTune.describe();
    }
}
