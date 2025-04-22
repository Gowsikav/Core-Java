package com.xworkz.interfaces.runner;

import com.xworkz.interfaces.external.HandBlender;
import com.xworkz.interfaces.internal.Blender;

public class BlenderRunner {
    public static void main(String[] args) {
        Blender blender = new HandBlender();
        blender.turnOn();
        blender.setSpeedLevel(3);
        blender.setTimer(5);
        blender.startBlending();
        blender.checkBlendStatus();
        blender.stopBlending();
        blender.turnOff();

        HandBlender handBlender = new HandBlender();
        handBlender.turnOn();
        handBlender.setSpeedLevel(4);
        handBlender.setTimer(10);
        handBlender.startBlending();
        handBlender.checkBlendStatus();
        handBlender.stopBlending();
        handBlender.turnOff();
    }
}
