package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Footwear;
import com.xworkz.overriding.internal.HikingBoots;

public class FootwearRunner {
    public static void main(String[] args) {
        Footwear everyday = new Footwear();
        everyday.describe();

        HikingBoots trailBlazer = new HikingBoots();
        trailBlazer.describe();
        trailBlazer.laceUp();

        Footwear outdoorGear = new HikingBoots();
        outdoorGear.describe();
    }
}
