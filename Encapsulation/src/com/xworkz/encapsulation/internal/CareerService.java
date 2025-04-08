package com.xworkz.encapsulation.internal;

public class CareerService {
    Occupation occupation;

    public CareerService(Occupation occupation) {
        this.occupation = occupation;
        System.out.println("CareerService Constructor");
    }

    public void assign() {
        occupation.setTitle("Software Engineer");
        occupation.setIndustry("IT");
        occupation.setYearsExperience(5);
        occupation.setRemote(true);
        occupation.setSalary(85000.75);

        System.out.println("Title: " + occupation.getTitle());
        System.out.println("Industry: " + occupation.getIndustry());
        System.out.println("Experience: " + occupation.getYearsExperience());
        System.out.println("Remote: " + occupation.isRemote());
        System.out.println("Salary: " + occupation.getSalary());
    }
}
