package com.xworkz.overriding.internal;

public class StrengthTraining extends Exercise{
    public StrengthTraining() {
        System.out.println("StrengthTraining constructor");
    }

    @Override
    public void describe() {
        System.out.println("Strength training involves exercises that improve muscle strength and endurance.");
    }

    public void liftWeights() {
        System.out.println("Lifting weights to increase muscle mass.");
    }
}
