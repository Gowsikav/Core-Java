package com.xworkz.encapsulation.external;

import com.xworkz.encapsulation.internal.Occupation;

public class OccupationDetails
{
    Occupation occupation;

    public OccupationDetails(Occupation occupation) {
        this.occupation = occupation;
        System.out.println("OccupationDetails Constructor");
    }

    public void display() {
        System.out.println("Title: " + occupation.getTitle());
        System.out.println("Industry: " + occupation.getIndustry());
        System.out.println("Experience: " + occupation.getYearsExperience());
        System.out.println("Remote: " + occupation.isRemote());
        System.out.println("Salary: " + occupation.getSalary());
    }
}
