package com.xworkz.overriding.internal;

public class DigitalContacts extends AddressBook{
    public DigitalContacts() {
        System.out.println("DigitalContacts constructor");
    }

    @Override
    public void describe() {
        System.out.println("DigitalContacts stores and syncs contacts across devices.");
    }

    public void syncCloud() {
        System.out.println("Syncing contacts with the cloud...");
    }
}
