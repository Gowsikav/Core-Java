package com.xworkz.checked.runner;

import com.xworkz.checked.exception.MobileNumberCheckException;

import java.util.concurrent.ExecutionException;

public class MobileNumberCheck {
    public static void main(String[] args) throws MobileNumberCheckException,CloneNotSupportedException{
        Long number=6836984930L;
        String mobNumber=number.toString();
        if(mobNumber.length()==10)
        {
            System.out.println("Mobile number is valid");
        }
        else {
            throw new MobileNumberCheckException("Mobile number is not valid");
        }
        display();
    }
    public static void display() throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }
}
