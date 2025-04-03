package com.xworkz.task;

public class Planet {
    Earth earth;

    public Planet(Earth earth) {
        System.out.println("Constructor in Planet");
        this.earth = earth;
    }

    public void invoke() {
        System.out.println("Invoking method in Earth");
        if (earth != null) {
            earth.gravity();
        } else {
            System.out.println("Earth is null");
        }
    }
}
