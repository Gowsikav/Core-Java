package com.xworkz.checked.runner;

import com.xworkz.checked.exception.MarkCheckException;

import java.rmi.AlreadyBoundException;

public class MarkCheck {
    public static void main(String[] args) throws MarkCheckException,AlreadyBoundException{
        float mark=78.3f;
        if(mark<50)
        {
            throw new MarkCheckException("Student is fail");
        }
        else {
            System.out.println("student is pass");
        }
        run();
    }
    public static void run() throws AlreadyBoundException
    {
        throw new AlreadyBoundException();
    }
}
