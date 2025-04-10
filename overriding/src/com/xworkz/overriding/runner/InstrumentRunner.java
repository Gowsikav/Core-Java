package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Guitar;
import com.xworkz.overriding.internal.Instrument;

public class InstrumentRunner
{
    public static void main(String[] args) {
        Instrument instrument = new Instrument();
        instrument.describe();

        Guitar guitar = new Guitar();
        guitar.describe();
        guitar.play();

        Instrument instrument1 = new Guitar();
        instrument1.describe();
    }
}
