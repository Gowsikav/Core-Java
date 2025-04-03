package com.xworkz.task;

public class Smoker {
    Cigarette cigarette;

    public Smoker(Cigarette cigarette) {
        System.out.println("Constructor in Smoker");
        this.cigarette = cigarette;
    }

    public void invoke() {
        System.out.println("Invoking method in Cigarette");
        if (cigarette != null) {
            cigarette.smoke();
        } else {
            System.out.println("Cigarette is null");
        }
    }
}
