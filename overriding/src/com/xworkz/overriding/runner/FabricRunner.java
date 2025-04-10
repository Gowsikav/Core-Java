package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.CottonFabric;
import com.xworkz.overriding.internal.Fabric;

public class FabricRunner {
    public static void main(String[] args) {
        Fabric genericFabric = new Fabric();
        genericFabric.describe();

        CottonFabric cotton = new CottonFabric();
        cotton.describe();
        cotton.washInstructions();

        Fabric chosenFabric = new CottonFabric();
        chosenFabric.describe();
    }
}
