package com.xworkz.encapsulation.internal;

public class Garage
{
    private String owner;
    private int vehicleCount;
    private boolean open24Hours;
    private String location;
    private double monthlyRevenue;

    public Garage() {
        System.out.println("Garage Constructor");
    }

    public String getOwner() {
        return owner;
    }

    void setOwner(String owner) {
        this.owner = owner;
    }

    public int getVehicleCount() {
        return vehicleCount;
    }

    void setVehicleCount(int vehicleCount) {
        this.vehicleCount = vehicleCount;
    }

    public boolean isOpen24Hours() {
        return open24Hours;
    }

    void setOpen24Hours(boolean open24Hours) {
        this.open24Hours = open24Hours;
    }

    public String getLocation() {
        return location;
    }

    void setLocation(String location) {
        this.location = location;
    }

    public double getMonthlyRevenue() {
        return monthlyRevenue;
    }

    void setMonthlyRevenue(double monthlyRevenue) {
        this.monthlyRevenue = monthlyRevenue;
    }
}
