package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.BackLighting;
import com.xworkz.overriding.internal.Blazer;

public class BackLightingRunner {
    public static void main(String[] args) {
        BackLighting light = new BackLighting();
        light.describe();

        Blazer litBlazer = new Blazer();
        litBlazer.describe();
        litBlazer.glow();

        BackLighting fashionTech = new Blazer();
        fashionTech.describe();
    }
}
