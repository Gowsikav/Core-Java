package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.DevicePrinter;

public class OfficeDevicePrinter implements DevicePrinter {

    @Override
    public void print() {
        System.out.println("OfficeDevicePrinter is printing");
    }

    @Override
    public void scan() {
        System.out.println("OfficeDevicePrinter is scanning");
    }

    @Override
    public void copy() {
        System.out.println("OfficeDevicePrinter is copying");
    }

    @Override
    public void fax() {
        System.out.println("OfficeDevicePrinter is sending fax");
    }

    @Override
    public void printColor(String color) {
        System.out.println("OfficeDevicePrinter is printing in " + color);
    }
}
