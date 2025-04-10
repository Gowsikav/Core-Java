package com.xworkz.overriding.internal;

public class AlarmClock extends Timer{
    public AlarmClock() {
        System.out.println("AlarmClock constructor");
    }

    @Override
    public void describe() {
        System.out.println("An alarm clock rings to alert you when time is up.");
    }

    public void ring() {
        System.out.println("The alarm clock is ringing! Time to wake up!");
    }
}
