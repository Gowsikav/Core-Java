package com.xworkz.overriding.internal;

public class SailVessel extends Vessel{
    public SailVessel() {
        System.out.println("SailVessel constructor");
    }

    @Override
    public void describe() {
        System.out.println("A sail vessel uses sails to harness wind power for movement across water.");
    }

    public void hoistSails() {
        System.out.println("Hoisting the sails on the sail vessel.");
    }
}
