package com.xworkz.encapsulation.internal;

public class Gym
{
    private String name;
    private int members;
    private boolean hasTrainer;
    private String location;
    private double monthlyFee;

    public Gym() {
        System.out.println("Gym Constructor");
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public int getMembers() {
        return members;
    }

    void setMembers(int members) {
        this.members = members;
    }

    public boolean isHasTrainer() {
        return hasTrainer;
    }

    void setHasTrainer(boolean hasTrainer) {
        this.hasTrainer = hasTrainer;
    }

    public String getLocation() {
        return location;
    }

    void setLocation(String location) {
        this.location = location;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }
}
