package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.AlarmClock1;
import com.xworkz.overriding.internal.SmartAlarm;

public class AlaramClockRunner {
    public static void main(String[] args) {
        AlarmClock1 traditional = new AlarmClock1();
        traditional.describe();

        SmartAlarm googleNest = new SmartAlarm();
        googleNest.describe();
        googleNest.syncWithApp();

        AlarmClock1 digital = new SmartAlarm();
        digital.describe();
    }
}
