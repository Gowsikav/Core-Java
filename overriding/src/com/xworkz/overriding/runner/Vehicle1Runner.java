package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.DeliveryVan;
import com.xworkz.overriding.internal.Vehicle1;

public class Vehicle1Runner {
    public static void main(String[] args) {
        Vehicle1 basic = new Vehicle1();
        basic.describe();

        DeliveryVan van = new DeliveryVan();
        van.describe();
        van.loadCargo();

        Vehicle1 transport = new DeliveryVan();
        transport.describe();
    }
}
