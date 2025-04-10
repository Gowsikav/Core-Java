package com.xworkz.overriding.internal;

public class BackHoe extends Boom
{
    public BackHoe() {
        System.out.println("Backhoe constructor");
    }

    @Override
    public void describe() {
        System.out.println("A backhoe makes booming sounds during heavy digging.");
    }

    public void dig() {
        System.out.println("Backhoe is digging the ground with force.");
    }
}
