package com.xworkz.encapsulation.internal;

public class GarageManager
{
    Garage garage;

    public GarageManager(Garage garage) {
        this.garage = garage;
        System.out.println("GarageManager Constructor");
    }

    public void organize() {
        garage.setOwner("Ravi Kumar");
        garage.setVehicleCount(22);
        garage.setOpen24Hours(true);
        garage.setLocation("JP Nagar");
        garage.setMonthlyRevenue(98000.0);

        System.out.println("Owner: " + garage.getOwner());
        System.out.println("Vehicle Count: " + garage.getVehicleCount());
        System.out.println("Open 24 Hours: " + garage.isOpen24Hours());
        System.out.println("Location: " + garage.getLocation());
        System.out.println("Monthly Revenue: " + garage.getMonthlyRevenue());
    }
}
