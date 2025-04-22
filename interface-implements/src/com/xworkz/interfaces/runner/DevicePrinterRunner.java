package com.xworkz.interfaces.runner;

import com.xworkz.interfaces.external.OfficeDevicePrinter;
import com.xworkz.interfaces.internal.DevicePrinter;

public class DevicePrinterRunner {
    public static void main(String[] args) {
        DevicePrinter printer = new OfficeDevicePrinter();
        printer.print();
        printer.scan();
        printer.copy();
        printer.fax();
        printer.printColor("blue");

        OfficeDevicePrinter officeDevicePrinter = new OfficeDevicePrinter();
        officeDevicePrinter.print();
        officeDevicePrinter.scan();
        officeDevicePrinter.copy();
        officeDevicePrinter.fax();
        officeDevicePrinter.printColor("red");
    }
}
