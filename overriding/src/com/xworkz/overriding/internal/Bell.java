package com.xworkz.overriding.internal;

public class Bell extends Briquet{
    public Bell() {
        System.out.println("Bell constructor");
    }

    @Override
    public void describe() {
        System.out.println("This is a bell that rings when the heating system overheats.");
    }

    public void ring() {
        System.out.println("Bell is ringing due to fire alert!");
    }
}
