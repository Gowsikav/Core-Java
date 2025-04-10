package com.xworkz.overriding.internal;

public class HybridTruck extends Transporter{
    public HybridTruck() {
        System.out.println("HybridTruck constructor");
    }

    @Override
    public void describe() {
        System.out.println("A hybrid truck uses both fuel and electric power for efficiency.");
    }

    public void loadCargo() {
        System.out.println("Loading cargo into the hybrid truck.");
    }

}
