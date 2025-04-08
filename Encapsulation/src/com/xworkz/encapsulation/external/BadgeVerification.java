package com.xworkz.encapsulation.external;

import com.xworkz.encapsulation.internal.Badge;

public class BadgeVerification
{
    Badge badge;

    public BadgeVerification(Badge badge) {
        this.badge = badge;
        System.out.println("BadgeVerification Constructor");
    }

    public void verify() {
        System.out.println("Title: " + badge.getTitle());
        System.out.println("Department: " + badge.getDepartment());
        System.out.println("Level: " + badge.getLevel());
        System.out.println("Active: " + badge.isActive());
        System.out.println("Issued By: " + badge.getIssuedBy());
    }
}
