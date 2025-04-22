package com.xworkz.interfaces.runner;

import com.xworkz.interfaces.external.InkjetPrinter;
import com.xworkz.interfaces.internal.Printer;

public class PrinterRunner
{
    public static void main(String[] args) {
        Printer printer=new InkjetPrinter();
        printer.print();

        InkjetPrinter inkjetPrinter=new InkjetPrinter();
        inkjetPrinter.print();
    }
}
