package com.xworkz.task;

public class HumanKidney {
    Kidney kidney;

    public HumanKidney(Kidney kidney) {
        System.out.println("Constructor in HumanKidney");
        this.kidney = kidney;
    }

    public void invoke() {
        System.out.println("Invoking method in Kidney");
        if (kidney != null) {
            kidney.filter();
        } else {
            System.out.println("Kidney is null");
        }
    }
}
