package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Bandana;
import com.xworkz.overriding.internal.Bullnose;

public class BullnoseRunner {
    public static void main(String[] args) {
        Bullnose edge = new Bullnose();
        edge.describe();

        Bandana accessory = new Bandana();
        accessory.describe();
        accessory.tie();

        Bullnose roundedFashion = new Bandana();
        roundedFashion.describe();
    }
}
