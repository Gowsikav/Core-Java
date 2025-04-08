package com.xworkz.encapsulation.internal;

public class Occupation
{
    private String title;
    private String industry;
    private int yearsExperience;
    private boolean isRemote;
    private double salary;

    public Occupation() {
        System.out.println("Occupation Constructor");
    }

    public String getTitle() {
        return title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    public String getIndustry() {
        return industry;
    }

    void setIndustry(String industry) {
        this.industry = industry;
    }

    public int getYearsExperience() {
        return yearsExperience;
    }

    void setYearsExperience(int yearsExperience) {
        this.yearsExperience = yearsExperience;
    }

    public boolean isRemote() {
        return isRemote;
    }

    void setRemote(boolean remote) {
        isRemote = remote;
    }

    public double getSalary() {
        return salary;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }
}
