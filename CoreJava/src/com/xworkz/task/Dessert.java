package com.xworkz.task;

public class Dessert {
    Sweet sweet;

    public Dessert(Sweet sweet) {
        System.out.println("Constructor in Dessert");
        this.sweet = sweet;
    }

    public void invoke() {
        System.out.println("Invoking method in Sweet");
        if (sweet != null) {
            sweet.taste();
        } else {
            System.out.println("Sweet is null");
        }
    }
}
