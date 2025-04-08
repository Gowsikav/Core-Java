package com.xworkz.encapsulation.external;

import com.xworkz.encapsulation.internal.Garage;

public class GarageReport
{
    Garage garage;

    public GarageReport(Garage garage) {
        this.garage = garage;
        System.out.println("GarageReport Constructor");
    }

    public void report() {
        System.out.println("Owner: " + garage.getOwner());
        System.out.println("Vehicle Count: " + garage.getVehicleCount());
        System.out.println("Open 24 Hours: " + garage.isOpen24Hours());
        System.out.println("Location: " + garage.getLocation());
        System.out.println("Monthly Revenue: " + garage.getMonthlyRevenue());
    }
}
