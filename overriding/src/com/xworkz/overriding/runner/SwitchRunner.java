package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.SmartSwitch;
import com.xworkz.overriding.internal.Switch;

public class SwitchRunner {
    public static void main(String[] args) {
        Switch basicSwitch = new Switch();
        basicSwitch.describe();

        SmartSwitch smartOne = new SmartSwitch();
        smartOne.describe();
        smartOne.connectToApp();

        Switch modernSwitch = new SmartSwitch();
        modernSwitch.describe();
    }
}
