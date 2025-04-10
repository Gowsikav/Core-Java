package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.GlassRoof;
import com.xworkz.overriding.internal.SkyLight;

public class SkylightRunner {
    public static void main(String[] args) {
        SkyLight skyLight = new SkyLight();
        skyLight.describe();

        GlassRoof glassRoof = new GlassRoof();
        glassRoof.describe();
        glassRoof.openRoof();

        SkyLight modernDesign = new GlassRoof();
        modernDesign.describe();
    }
}
