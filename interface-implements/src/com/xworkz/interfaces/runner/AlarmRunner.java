package com.xworkz.interfaces.runner;

import com.xworkz.interfaces.external.HomeAlarm;
import com.xworkz.interfaces.internal.Alarm;

public class AlarmRunner {
    public static void main(String[] args) {
        Alarm alarm = new HomeAlarm();
        alarm.set();
        alarm.ring();
        alarm.cancel();

        HomeAlarm homeAlarm = new HomeAlarm();
        homeAlarm.set();
        homeAlarm.ring();
        homeAlarm.cancel();
    }
}
