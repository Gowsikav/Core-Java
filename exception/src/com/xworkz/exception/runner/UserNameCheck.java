package com.xworkz.exception.runner;

import com.xworkz.exception.internal.InvalidNameException;

public class UserNameCheck {
    public static void main(String[] args) {
        String name="3ram";
        if(name.charAt(0)>=48 && name.charAt(0) <=57)
        {
            throw new InvalidNameException("Name is start with number that's incorrect");
        }
        else {
            System.out.println("Name is correct");
        }

    }
}
