package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Camera;

public class DslrCamera implements Camera {

    @Override
    public void capture() {
        System.out.println("Capturing photo using DslrCamera");
    }
}
