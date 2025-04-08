package com.xworkz.encapsulation.internal;

public class PostOffice
{
    private String name;
    private String location;
    private int employees;
    private boolean openOnWeekend;
    private String headOfficer;

    public PostOffice() {
        System.out.println("PostOffice Constructor");
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    void setLocation(String location) {
        this.location = location;
    }

    public int getEmployees() {
        return employees;
    }

    void setEmployees(int employees) {
        this.employees = employees;
    }

    public boolean isOpenOnWeekend() {
        return openOnWeekend;
    }

    void setOpenOnWeekend(boolean openOnWeekend) {
        this.openOnWeekend = openOnWeekend;
    }

    public String getHeadOfficer() {
        return headOfficer;
    }

    void setHeadOfficer(String headOfficer) {
        this.headOfficer = headOfficer;
    }
}
