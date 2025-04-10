package com.xworkz.overriding.internal;

public class Earth extends Planet
{
    public Earth() {
        System.out.println("Earth constructor");
    }

    @Override
    public void describe() {
        System.out.println("This is Earth, the only known planet with life.");
    }

    public void supportLife() {
        System.out.println("Earth supports life with air, water, and food.");
    }
}
