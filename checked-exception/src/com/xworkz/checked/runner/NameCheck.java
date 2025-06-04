package com.xworkz.checked.runner;

import com.xworkz.checked.exception.NameCheckException;

import java.io.FileNotFoundException;

public class NameCheck {
    public static void main(String[] args) throws NameCheckException, FileNotFoundException {
        String name="raj";
        if(name.length()<3)
        {
            throw new NameCheckException("Name is not correct");
        }
        else {
            System.out.println("Name is correct");
        }
        display();
    }

    public static void display() throws FileNotFoundException
    {
        throw new FileNotFoundException("file not found");
    }
}
