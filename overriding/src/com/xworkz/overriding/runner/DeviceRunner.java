package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Device;
import com.xworkz.overriding.internal.SmartPhone;

public class DeviceRunner
{
    public static void main(String[] args) {
        Device device = new Device();
        device.describe();

        SmartPhone phone = new SmartPhone();
        phone.describe();
        phone.browseInternet();

        Device device1 = new SmartPhone();
        device1.describe();
    }
}
