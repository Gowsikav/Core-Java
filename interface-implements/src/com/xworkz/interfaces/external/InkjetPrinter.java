package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Printer;

public class InkjetPrinter implements Printer
{

    @Override
    public void print() {
        System.out.println("running print in inkjetPrinter");
    }
}
