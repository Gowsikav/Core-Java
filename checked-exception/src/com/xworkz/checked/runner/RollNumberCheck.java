package com.xworkz.checked.runner;

import com.xworkz.checked.exception.RollNumberException;

public class RollNumberCheck {
    public static void main(String[] args) throws RollNumberException,ClassNotFoundException{
        String rollNumber="21BCS092";
        if(rollNumber.contains("[0-9]"))
        {
            System.out.println("Roll number is valid");
        }
        else{
            throw new RollNumberException("Rollnumber is not valid");
        }
        run();
    }
    public static void run() throws ClassNotFoundException
    {
        throw new ClassNotFoundException();
    }
}
