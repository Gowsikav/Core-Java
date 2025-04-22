package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.PhotographyDevice;

public class DigitalCamera implements PhotographyDevice {

    @Override
    public void capturePhoto() {
        System.out.println("DigitalCamera capturing photo");
    }

    @Override
    public void startRecording() {
        System.out.println("DigitalCamera starting video recording");
    }

    @Override
    public void stopRecording() {
        System.out.println("DigitalCamera stopping video recording");
    }

    @Override
    public void zoomIn(int level) {
        System.out.println("DigitalCamera zooming in by " + level + " levels");
    }

    @Override
    public void zoomOut(int level) {
        System.out.println("DigitalCamera zooming out by " + level + " levels");
    }
}
