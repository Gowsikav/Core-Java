package com.xworkz.overriding.internal;

public class Guitar extends Instrument
{
    public Guitar() {
        System.out.println("Guitar constructor");
    }

    @Override
    public void describe() {
        System.out.println("This is a guitar, a string instrument.");
    }

    public void play() {
        System.out.println("Strumming the guitar.");
    }
}
