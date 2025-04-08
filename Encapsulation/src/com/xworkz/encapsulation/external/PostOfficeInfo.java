package com.xworkz.encapsulation.external;

import com.xworkz.encapsulation.internal.PostOffice;

public class PostOfficeInfo
{
    PostOffice postOffice;

    public PostOfficeInfo(PostOffice postOffice) {
        this.postOffice = postOffice;
        System.out.println("PostOfficeInfo Constructor");
    }

    public void show() {
        System.out.println("Name: " + postOffice.getName());
        System.out.println("Location: " + postOffice.getLocation());
        System.out.println("Employees: " + postOffice.getEmployees());
        System.out.println("Open on Weekend: " + postOffice.isOpenOnWeekend());
        System.out.println("Head Officer: " + postOffice.getHeadOfficer());
    }
}
