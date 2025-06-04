package com.xworkz.checked.runner;

import com.xworkz.checked.exception.AssignmentCheckException;

import java.awt.print.PrinterException;

public class AssignmentCheck {
    public static void main(String[] args) throws AssignmentCheckException,PrinterException{
        boolean isAssignmentCompleted=true;
        if(isAssignmentCompleted)
        {
            throw new AssignmentCheckException("Assignment is completed");
        }
        else {
            System.out.println("Assignment is not completed");
        }
        display();
    }
    public static void display() throws PrinterException
    {
        throw new PrinterException();
    }
}
