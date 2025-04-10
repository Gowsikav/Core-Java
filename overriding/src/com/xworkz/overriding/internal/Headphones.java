package com.xworkz.overriding.internal;

public class Headphones extends Speaker{
    public Headphones() {
        System.out.println("Headphones constructor");
    }

    @Override
    public void describe() {
        System.out.println("Headphones provide immersive, personal audio.");
    }

    public void adjustVolume() {
        System.out.println("Volume adjusted for personal comfort.");
    }
}
