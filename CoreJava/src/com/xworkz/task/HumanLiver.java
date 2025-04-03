package com.xworkz.task;

public class HumanLiver {
    Liver liver;

    public HumanLiver(Liver liver) {
        System.out.println("Constructor in HumanLiver");
        this.liver = liver;
    }

    public void invoke() {
        System.out.println("Invoking method in Liver");
        if (liver != null) {
            liver.function();
        } else {
            System.out.println("Liver is null");
        }
    }
}
