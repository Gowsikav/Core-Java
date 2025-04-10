package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Compass;
import com.xworkz.overriding.internal.Navigator;

public class CompassRunner {
    public static void main(String[] args) {
        Compass compass = new Compass();
        compass.describe();

        Navigator navigator = new Navigator();
        navigator.describe();
        navigator.plotCourse();

        Compass guide = new Navigator();
        guide.describe();
    }
}
