package com.xworkz.encapsulation.internal;

public class Apartment
{
    private String buildingName;
    private int floors;
    private int flatsPerFloor;
    private boolean hasLift;
    private String location;

    public Apartment() {
        System.out.println("Apartment Constructor");
    }

    public String getBuildingName() {
        return buildingName;
    }

    void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public int getFloors() {
        return floors;
    }

    void setFloors(int floors) {
        this.floors = floors;
    }

    public int getFlatsPerFloor() {
        return flatsPerFloor;
    }

    void setFlatsPerFloor(int flatsPerFloor) {
        this.flatsPerFloor = flatsPerFloor;
    }

    public boolean isHasLift() {
        return hasLift;
    }

    void setHasLift(boolean hasLift) {
        this.hasLift = hasLift;
    }

    public String getLocation() {
        return location;
    }

    void setLocation(String location) {
        this.location = location;
    }
}
