package com.xworkz.overriding.internal;

public class Broom extends Boat
{
    public Broom() {
        System.out.println("Broom constructor");
    }

    @Override
    public void describe() {
        System.out.println("This is a special boat used to clean debris from water surfaces.");
    }

    public void sweepWater() {
        System.out.println("Sweeping trash from the water using cleaning paddles.");
    }
}
