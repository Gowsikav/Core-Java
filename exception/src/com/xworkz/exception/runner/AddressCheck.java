package com.xworkz.exception.runner;

import com.xworkz.exception.internal.AadhaarNumberCheckException;

public class AddressCheck {
    public static void main(String[] args) {
        String address="chennai null";
        if(address.contains("null"))
        {
            throw new AadhaarNumberCheckException("Address contains null");
        }
        else {
            System.out.println("Address is correct");
        }
    }
}
