package com.xworkz.overriding.internal;

public class PressureCooker extends Cookware{
    public PressureCooker() {
        System.out.println("PressureCooker constructor");
    }

    @Override
    public void describe() {
        System.out.println("A pressure cooker uses steam pressure to cook food quickly.");
    }

    public void releaseSteam() {
        System.out.println("Releasing steam from the pressure cooker.");
    }
}
