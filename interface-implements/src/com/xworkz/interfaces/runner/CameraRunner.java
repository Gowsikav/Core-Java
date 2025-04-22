package com.xworkz.interfaces.runner;

import com.xworkz.interfaces.external.DslrCamera;
import com.xworkz.interfaces.internal.Camera;

public class CameraRunner {
    public static void main(String[] args) {
        Camera camera = new DslrCamera();
        camera.capture();

        DslrCamera dslrCamera = new DslrCamera();
        dslrCamera.capture();
    }
}
