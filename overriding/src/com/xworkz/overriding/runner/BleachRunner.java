package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Bleach;
import com.xworkz.overriding.internal.Brogue;

public class BleachRunner
{
    public static void main(String[] args) {
        Bleach bleach = new Bleach();
        bleach.describe();

        Brogue brogue = new Brogue();
        brogue.describe();
        brogue.polish();

        Bleach bleach1 = new Brogue();
        bleach1.describe();
    }
}
