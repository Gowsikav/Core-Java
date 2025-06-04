package com.xworkz.checked.runner;

import com.xworkz.checked.exception.InvalidAgeException;

public class AgeCheck {
    public static void main(String[] args) throws InvalidAgeException,NoSuchMethodException {
        int age=1;
        if(age<0)
        {
            throw new InvalidAgeException("Age is not correct");
        }
        else {
            System.out.println("Age is correct");
        }
        save();
    }
    public static void save() throws NoSuchMethodException
    {
        throw new NoSuchMethodException();
    }
}
