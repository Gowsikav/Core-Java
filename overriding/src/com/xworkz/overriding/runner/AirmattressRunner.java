package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.AirMattress;
import com.xworkz.overriding.internal.FoamMattress;

public class AirmattressRunner {
    public static void main(String[] args) {
        AirMattress inflatable = new AirMattress();
        inflatable.describe();

        FoamMattress cozy = new FoamMattress();
        cozy.describe();
        cozy.adjustFirmness();

        AirMattress sleeper = new FoamMattress();
        sleeper.describe();
    }
}
