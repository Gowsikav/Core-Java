package com.xworkz.exception.runner;

import com.xworkz.exception.internal.CountryCheckException;

public class CountryCheck {
    public static void main(String[] args) {
        String country="america";
        if(country.equalsIgnoreCase("india"))
        {
            System.out.println("Country is india");
        }
        else {
            throw new CountryCheckException("Country name is not india");
        }
    }
}
