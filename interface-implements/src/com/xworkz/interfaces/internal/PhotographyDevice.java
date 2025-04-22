package com.xworkz.interfaces.internal;

public interface PhotographyDevice {
    void capturePhoto();
    void startRecording();
    void stopRecording();
    void zoomIn(int level);
    void zoomOut(int level);
}
