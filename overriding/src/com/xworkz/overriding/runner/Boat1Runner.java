package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Boat1;
import com.xworkz.overriding.internal.Briefs;

public class Boat1Runner {
    public static void main(String[] args) {
        Boat1 boat = new Boat1();
        boat.describe();

        Briefs swimBriefs = new Briefs();
        swimBriefs.describe();
        swimBriefs.wear();

        Boat1 sportyBriefs = new Briefs();
        sportyBriefs.describe();
    }
}
