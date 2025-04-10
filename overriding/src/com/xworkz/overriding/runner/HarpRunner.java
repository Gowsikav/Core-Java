package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.ElectricHarp;
import com.xworkz.overriding.internal.Harp;

public class HarpRunner {
    public static void main(String[] args) {
        Harp classicalHarp = new Harp();
        classicalHarp.describe();

        ElectricHarp modernHarp = new ElectricHarp();
        modernHarp.describe();
        modernHarp.adjustVolume();

        Harp electricHarp = new ElectricHarp();
        electricHarp.describe();
    }
}

