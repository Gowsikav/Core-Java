package com.xworkz.modifier.external;

import com.xworkz.modifier.internal.Church;

public class Believer
{
    public Believer() {
        System.out.println("Believer constructor");
    }

    public void attendService() {
        System.out.println("running in attendService method");
        Church church = new Church();
        church.open();
    }
}
