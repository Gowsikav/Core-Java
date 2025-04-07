package com.xworkz.modifier.external;

import com.xworkz.modifier.internal.Drone;

public class Engineer
{
    public Engineer() {
        System.out.println("Engineer constructor");
    }

    public void testDrone() {
        System.out.println("running in testDrone method");
        Drone drone = new Drone();
        drone.fly();
    }
}
