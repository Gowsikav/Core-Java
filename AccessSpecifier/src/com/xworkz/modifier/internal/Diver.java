package com.xworkz.modifier.internal;

public class Diver
{
    public Diver() {
        System.out.println("Diver constructor");
    }

    public void collect() {
        System.out.println("running in collect method");
        Shell shell = new Shell();
        shell.crack();
        shell.observe();
    }
}
