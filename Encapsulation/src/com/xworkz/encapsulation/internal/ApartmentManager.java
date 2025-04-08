package com.xworkz.encapsulation.internal;

public class ApartmentManager
{
    Apartment apartment;

    public ApartmentManager(Apartment apartment) {
        this.apartment = apartment;
        System.out.println("ApartmentManager Constructor");
    }

    public void manage() {
        apartment.setBuildingName("SkyHeights Residency");
        apartment.setFloors(12);
        apartment.setFlatsPerFloor(4);
        apartment.setHasLift(true);
        apartment.setLocation("Rajajinagar");

        System.out.println("Building Name: " + apartment.getBuildingName());
        System.out.println("Floors: " + apartment.getFloors());
        System.out.println("Flats Per Floor: " + apartment.getFlatsPerFloor());
        System.out.println("Has Lift: " + apartment.isHasLift());
        System.out.println("Location: " + apartment.getLocation());
    }
}
