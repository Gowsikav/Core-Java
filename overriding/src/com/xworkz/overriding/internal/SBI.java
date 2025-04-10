package com.xworkz.overriding.internal;

public class SBI extends Bank
{
    public SBI() {
        System.out.println("SBI constructor");
    }

    @Override
    public void describe() {
        System.out.println("This is SBI, a public sector bank.");
    }

    public void offerLoan() {
        System.out.println("SBI is offering a home loan.");
    }
}
