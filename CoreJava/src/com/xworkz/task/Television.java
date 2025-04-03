package com.xworkz.task;

public class Television {
    BlackAndWhite blackAndWhite;

    public Television(BlackAndWhite blackAndWhite) {
        System.out.println("Constructor in Television");
        this.blackAndWhite = blackAndWhite;
    }

    public void invoke() {
        System.out.println("Invoking method in BlackAndWhite");
        if (blackAndWhite != null) {
            blackAndWhite.display();
        } else {
            System.out.println("BlackAndWhite is null");
        }
    }
}
