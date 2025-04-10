package com.xworkz.overriding.internal;

public class ElectricHammer extends Hammer{
    public ElectricHammer() {
        System.out.println("ElectricHammer constructor");
    }

    @Override
    public void describe() {
        System.out.println("An electric hammer is a power tool used for heavy-duty hammering tasks.");
    }

    public void adjustSpeed() {
        System.out.println("Adjusting the speed of the electric hammer.");
    }
}
