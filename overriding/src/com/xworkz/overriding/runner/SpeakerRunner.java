package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Headphones;
import com.xworkz.overriding.internal.Speaker;

public class SpeakerRunner {
    public static void main(String[] args) {
        Speaker speaker = new Speaker();
        speaker.describe();

        Headphones headphones = new Headphones();
        headphones.describe();
        headphones.adjustVolume();

        Speaker audioDevice = new Headphones();
        audioDevice.describe();
    }
}
