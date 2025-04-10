package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.AddressBook;
import com.xworkz.overriding.internal.DigitalContacts;

public class AddressBookRunner {
    public static void main(String[] args) {
        AddressBook classic = new AddressBook();
        classic.describe();

        DigitalContacts googleContacts = new DigitalContacts();
        googleContacts.describe();
        googleContacts.syncCloud();

        AddressBook synced = new DigitalContacts();
        synced.describe();
    }
}
