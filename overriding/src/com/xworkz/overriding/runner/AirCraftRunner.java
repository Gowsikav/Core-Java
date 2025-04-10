package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Aircraft;
import com.xworkz.overriding.internal.JetPlane;

public class AirCraftRunner {
    public static void main(String[] args) {
        Aircraft flyer = new Aircraft();
        flyer.describe();

        JetPlane fighterJet = new JetPlane();
        fighterJet.describe();
        fighterJet.engageTurbo();

        Aircraft passengerJet = new JetPlane();
        passengerJet.describe();
    }
}
