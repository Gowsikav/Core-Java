package com.xworkz.overriding.internal;

public class Saxophone extends SoundDevice{
    public Saxophone() {
        System.out.println("Saxophone constructor");
    }

    @Override
    public void describe() {
        System.out.println("A saxophone is a woodwind instrument known for its rich tone.");
    }

    public void playJazz() {
        System.out.println("Playing a smooth jazz solo on the saxophone.");
    }
}
