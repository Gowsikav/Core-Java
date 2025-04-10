package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.CameraLens;
import com.xworkz.overriding.internal.Lens;

public class LensRunner {
    public static void main(String[] args) {
        Lens genericLens = new Lens();
        genericLens.describe();

        CameraLens canonLens = new CameraLens();
        canonLens.describe();
        canonLens.zoom();

        Lens portraitLens = new CameraLens();
        portraitLens.describe();
    }
}
