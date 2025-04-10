package com.xworkz.overriding.internal;

public class SmartAlarm extends AlarmClock1{
    public SmartAlarm() {
        System.out.println("SmartAlarm constructor");
    }

    @Override
    public void describe() {
        System.out.println("A smart alarm includes features like weather updates and voice control.");
    }

    public void syncWithApp() {
        System.out.println("Smart alarm is synced with your phone app.");
    }
}
