package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Bed;
import com.xworkz.overriding.internal.Blouse;

public class BenchRunner {
    public static void main(String[] args) {
        Bed bed = new Bed();
        bed.describe();

        Blouse blouse = new Blouse();
        blouse.describe();
        blouse.wear();

        Bed bedtimeOutfit = new Blouse();
        bedtimeOutfit.describe();
    }
}
