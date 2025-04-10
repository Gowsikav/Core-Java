package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.SailVessel;
import com.xworkz.overriding.internal.Vessel;

public class VesselRunner {
    public static void main(String[] args) {
        Vessel basicVessel = new Vessel();
        basicVessel.describe();

        SailVessel sailboat = new SailVessel();
        sailboat.describe();
        sailboat.hoistSails();

        Vessel seaVessel = new SailVessel();
        seaVessel.describe();
    }
}
