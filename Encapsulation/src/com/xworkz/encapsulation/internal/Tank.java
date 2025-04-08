package com.xworkz.encapsulation.internal;

public class Tank
{
    private String model;
    private int capacity;
    private String type;
    private boolean armored;
    private double range;

    public Tank() {
        System.out.println("Tank Constructor");
    }

    public String getModel() {
        return model;
    }

    void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    void setType(String type) {
        this.type = type;
    }

    public boolean isArmored() {
        return armored;
    }

    void setArmored(boolean armored) {
        this.armored = armored;
    }

    public double getRange() {
        return range;
    }

    void setRange(double range) {
        this.range = range;
    }
}
