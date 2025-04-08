package com.xworkz.encapsulation.internal;

public class PostOfficeService
{
    PostOffice postOffice;

    public PostOfficeService(PostOffice postOffice) {
        this.postOffice = postOffice;
        System.out.println("PostOfficeService Constructor");
    }

    public void register() {
        postOffice.setName("Central PO");
        postOffice.setLocation("Bangalore");
        postOffice.setEmployees(42);
        postOffice.setOpenOnWeekend(false);
        postOffice.setHeadOfficer("Mr. Rao");

        System.out.println("Name: " + postOffice.getName());
        System.out.println("Location: " + postOffice.getLocation());
        System.out.println("Employees: " + postOffice.getEmployees());
        System.out.println("Open on Weekend: " + postOffice.isOpenOnWeekend());
        System.out.println("Head Officer: " + postOffice.getHeadOfficer());
    }
}
