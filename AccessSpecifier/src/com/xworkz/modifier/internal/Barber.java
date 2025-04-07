package com.xworkz.modifier.internal;

public class Barber
{
    public Barber() {
        System.out.println("Barber constructor");
    }

    public void styleHair() {
        System.out.println("running in styleHair method");
        Comb comb = new Comb();
        comb.use();
        comb.checkTeeth();
    }
}
