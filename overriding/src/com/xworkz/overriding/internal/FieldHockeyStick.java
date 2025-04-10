package com.xworkz.overriding.internal;

public class FieldHockeyStick extends HockeyStick{
    public FieldHockeyStick() {
        System.out.println("FieldHockeyStick constructor");
    }

    @Override
    public void describe() {
        System.out.println("A field hockey stick is specifically designed for field hockey games.");
    }

    public void checkLength() {
        System.out.println("Checking the length of the field hockey stick.");
    }
}
