package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.AjaxCleaner;
import com.xworkz.overriding.internal.EcoCleaner;

public class AjxCleanerRunner {
    public static void main(String[] args) {
        AjaxCleaner classicCleaner = new AjaxCleaner();
        classicCleaner.describe();

        EcoCleaner greenCleaner = new EcoCleaner();
        greenCleaner.describe();
        greenCleaner.refill();

        AjaxCleaner ecoFriendly = new EcoCleaner();
        ecoFriendly.describe();
    }
}
