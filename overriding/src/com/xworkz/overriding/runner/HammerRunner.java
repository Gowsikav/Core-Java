package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.ElectricHammer;
import com.xworkz.overriding.internal.Hammer;

public class HammerRunner {
    public static void main(String[] args) {
        Hammer basicHammer = new Hammer();
        basicHammer.describe();

        ElectricHammer powerHammer = new ElectricHammer();
        powerHammer.describe();
        powerHammer.adjustSpeed();

        Hammer toolHammer = new ElectricHammer();
        toolHammer.describe();
    }
}
