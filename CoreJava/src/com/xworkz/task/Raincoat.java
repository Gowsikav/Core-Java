package com.xworkz.task;

public class Raincoat {
    Umbrella umbrella;

    public Raincoat(Umbrella umbrella) {
        System.out.println("Constructor in Raincoat");
        this.umbrella = umbrella;
    }

    public void invoke() {
        System.out.println("Invoking method in Umbrella");
        if (umbrella != null) {
            umbrella.open();
        } else {
            System.out.println("Umbrella is null");
        }
    }
}
