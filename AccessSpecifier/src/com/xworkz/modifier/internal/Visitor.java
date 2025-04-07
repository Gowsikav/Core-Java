package com.xworkz.modifier.internal;

public class Visitor
{
    public Visitor() {
        System.out.println("Visitor constructor");
    }

    public void enjoy() {
        System.out.println("running in enjoy method");
        Beach beach = new Beach();
        beach.enter();
        beach.relax();
    }
}
