package com.xworkz.overriding.internal;

public class GlassRoof extends SkyLight{
    public GlassRoof() {
        System.out.println("GlassRoof constructor");
    }

    @Override
    public void describe() {
        System.out.println("The glass roof enhances natural lighting just like a skylight, but on a grander scale.");
    }

    public void openRoof() {
        System.out.println("Opening the glass roof for fresh air and sunshine.");
    }
}
