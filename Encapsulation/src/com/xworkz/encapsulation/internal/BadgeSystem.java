package com.xworkz.encapsulation.internal;

public class BadgeSystem
{
    Badge badge;

    public BadgeSystem(Badge badge) {
        this.badge = badge;
        System.out.println("BadgeSystem Constructor");
    }

    public void generate() {
        badge.setTitle("Security Officer");
        badge.setDepartment("Logistics");
        badge.setLevel(3);
        badge.setActive(true);
        badge.setIssuedBy("Central Command");

        System.out.println("Title: " + badge.getTitle());
        System.out.println("Department: " + badge.getDepartment());
        System.out.println("Level: " + badge.getLevel());
        System.out.println("Active: " + badge.isActive());
        System.out.println("Issued By: " + badge.getIssuedBy());
    }
}
