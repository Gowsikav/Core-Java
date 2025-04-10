package com.xworkz.overriding.internal;

public class Bell1 extends Byre{
    public Bell1() {
        System.out.println("Bell constructor");
    }

    @Override
    public void describe() {
        System.out.println("This is a cowbell used to locate animals in the byre.");
    }

    public void jingle() {
        System.out.println("The bell is jingling as the cow moves.");
    }
}
