package com.xworkz.overriding.internal;

public class Spectrometer extends Analyzer{
    public Spectrometer() {
        System.out.println("Spectrometer constructor");
    }

    @Override
    public void describe() {
        System.out.println("A spectrometer analyzes the spectrum of light from substances.");
    }

    public void measureWavelength() {
        System.out.println("Measuring light wavelength with the spectrometer.");
    }
}
