package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Alarm;

public class HomeAlarm implements Alarm {

    @Override
    public void set() {
        System.out.println("HomeAlarm has been set");
    }

    @Override
    public void cancel() {
        System.out.println("HomeAlarm has been cancelled");
    }

    @Override
    public void ring() {
        System.out.println("HomeAlarm is ringing!");
    }
}
