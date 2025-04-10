package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Allspice;
import com.xworkz.overriding.internal.SpiceBlend;

public class AllspiceRunner {
    public static void main(String[] args) {
        Allspice pureSpice = new Allspice();
        pureSpice.describe();

        SpiceBlend chefMix = new SpiceBlend();
        chefMix.describe();
        chefMix.mixSpices();

        Allspice secretRecipe = new SpiceBlend();
        secretRecipe.describe();
    }
}
