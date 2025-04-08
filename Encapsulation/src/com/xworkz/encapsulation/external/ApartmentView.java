package com.xworkz.encapsulation.external;

import com.xworkz.encapsulation.internal.Apartment;

public class ApartmentView
{
    Apartment apartment;

    public ApartmentView(Apartment apartment) {
        this.apartment = apartment;
        System.out.println("ApartmentView Constructor");
    }

    public void display() {
        System.out.println("Building Name: " + apartment.getBuildingName());
        System.out.println("Floors: " + apartment.getFloors());
        System.out.println("Flats Per Floor: " + apartment.getFlatsPerFloor());
        System.out.println("Has Lift: " + apartment.isHasLift());
        System.out.println("Location: " + apartment.getLocation());
    }
}
