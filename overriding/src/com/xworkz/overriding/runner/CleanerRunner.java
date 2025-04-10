package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Cleaner;
import com.xworkz.overriding.internal.VacuumCleaner;

public class CleanerRunner {
    public static void main(String[] args) {
        Cleaner basicCleaner = new Cleaner();
        basicCleaner.describe();

        VacuumCleaner dyson = new VacuumCleaner();
        dyson.describe();
        dyson.startSuction();

        Cleaner smartCleaner = new VacuumCleaner();
        smartCleaner.describe();
    }
}
