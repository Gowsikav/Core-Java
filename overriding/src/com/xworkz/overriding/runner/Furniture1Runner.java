package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Furniture1;
import com.xworkz.overriding.internal.ModernBed;

public class Furniture1Runner {
    public static void main(String[] args) {
        Furniture1 basic = new Furniture1();
        basic.describe();

        ModernBed smartBed = new ModernBed();
        smartBed.describe();
        smartBed.enableLights();

        Furniture1 elegant = new ModernBed();
        elegant.describe();
    }
}
