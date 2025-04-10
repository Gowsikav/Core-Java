package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Bark;
import com.xworkz.overriding.internal.Bicycle;

public class BarkRunner {
    public static void main(String[] args) {
        Bark bark = new Bark();
        bark.describe();

        Bicycle cycle = new Bicycle();
        cycle.describe();
        cycle.pedal();

        Bark bark1 = new Bicycle();
        bark1.describe();
    }
}
