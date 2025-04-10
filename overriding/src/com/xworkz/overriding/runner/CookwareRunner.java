package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Cookware;
import com.xworkz.overriding.internal.PressureCooker;

public class CookwareRunner {
    public static void main(String[] args) {
        Cookware pot = new Cookware();
        pot.describe();

        PressureCooker presto = new PressureCooker();
        presto.describe();
        presto.releaseSteam();

        Cookware smartPot = new PressureCooker();
        smartPot.describe();
    }
}
