package com.xworkz.interfaces.runner;

import com.xworkz.interfaces.external.DigitalCamera;
import com.xworkz.interfaces.internal.PhotographyDevice;

public class PhotographyDeviceRunner {
    public static void main(String[] args) {
        PhotographyDevice device = new DigitalCamera();
        device.capturePhoto();
        device.startRecording();
        device.zoomIn(3);
        device.zoomOut(2);
        device.stopRecording();

        DigitalCamera digitalCamera = new DigitalCamera();
        digitalCamera.capturePhoto();
        digitalCamera.startRecording();
        digitalCamera.zoomIn(5);
        digitalCamera.zoomOut(4);
        digitalCamera.stopRecording();
    }
}
