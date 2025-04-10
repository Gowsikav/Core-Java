package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.AlarmClock;
import com.xworkz.overriding.internal.Timer;

public class TimerRunner {
    public static void main(String[] args) {
        Timer simpleTimer = new Timer();
        simpleTimer.describe();

        AlarmClock myAlarm = new AlarmClock();
        myAlarm.describe();
        myAlarm.ring();

        Timer morningDevice = new AlarmClock();
        morningDevice.describe();
    }
}
