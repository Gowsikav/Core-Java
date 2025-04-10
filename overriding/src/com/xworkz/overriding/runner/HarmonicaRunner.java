package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.ElectricHarmonica;
import com.xworkz.overriding.internal.Harmonica;

public class HarmonicaRunner {
    public static void main(String[] args) {
        Harmonica basicHarmonica = new Harmonica();
        basicHarmonica.describe();

        ElectricHarmonica electricHarmonica = new ElectricHarmonica();
        electricHarmonica.describe();
        electricHarmonica.adjustVolume();

        Harmonica musicInstrument = new ElectricHarmonica();
        musicInstrument.describe();
    }
}
