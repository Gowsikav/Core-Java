package com.xworkz.exception.runner;

import com.xworkz.exception.internal.NameLengthException;

public class NameLength {
    public static void main(String[] args) {
        String name="Ra";
        if(name.length()<3) {
            throw new NameLengthException("Name length is less than 3");
        }
        else {
            System.out.println("Name is correct");
        }
    }
}
