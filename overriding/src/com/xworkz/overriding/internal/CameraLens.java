package com.xworkz.overriding.internal;

public class CameraLens extends Lens{
    public CameraLens() {
        System.out.println("CameraLens constructor");
    }

    @Override
    public void describe() {
        System.out.println("CameraLens captures high-quality images by adjusting focal length.");
    }

    public void zoom() {
        System.out.println("Zooming in on the subject using the camera lens.");
    }
}
