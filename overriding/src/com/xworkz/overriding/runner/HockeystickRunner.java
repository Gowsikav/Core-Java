package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.FieldHockeyStick;
import com.xworkz.overriding.internal.HockeyStick;

public class HockeystickRunner {
    public static void main(String[] args) {
        HockeyStick basicStick = new HockeyStick();
        basicStick.describe();

        FieldHockeyStick proStick = new FieldHockeyStick();
        proStick.describe();
        proStick.checkLength();

        HockeyStick advancedStick = new FieldHockeyStick();
        advancedStick.describe();
    }
}
