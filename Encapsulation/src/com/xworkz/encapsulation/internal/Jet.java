package com.xworkz.encapsulation.internal;

public class Jet
{
    private String model;
    private double speed;
    private int capacity;
    private boolean military;
    private String manufacturer;

    public Jet() {
        System.out.println("Jet Constructor");
    }

    public String getModel() {
        return model;
    }

    void setModel(String model) {
        this.model = model;
    }

    public double getSpeed() {
        return speed;
    }

    void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getCapacity() {
        return capacity;
    }

    void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isMilitary() {
        return military;
    }

    void setMilitary(boolean military) {
        this.military = military;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

}
