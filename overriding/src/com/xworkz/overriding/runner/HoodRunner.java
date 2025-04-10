package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Hood;
import com.xworkz.overriding.internal.WinterHood;

public class HoodRunner {
    public static void main(String[] args) {
        Hood basicHood = new Hood();
        basicHood.describe();

        WinterHood cozyHood = new WinterHood();
        cozyHood.describe();
        cozyHood.adjustTightness();

        Hood upgradedHood = new WinterHood();
        upgradedHood.describe();
    }
}
