package com.xworkz.overriding.internal;

public class DeliveryVan extends Vehicle1{
    public DeliveryVan() {
        System.out.println("DeliveryVan constructor");
    }

    @Override
    public void describe() {
        System.out.println("DeliveryVan is optimized for carrying and delivering packages.");
    }

    public void loadCargo() {
        System.out.println("Loading cargo into the delivery van.");
    }
}
