package com.xworkz.checked.runner;

import com.xworkz.checked.exception.UserNotFoundException;

import java.util.concurrent.TimeoutException;

public class UserNameCheck {
    public static void main(String[] args) throws UserNotFoundException,TimeoutException {
        String userName="Shivya";
        if(userName.equals("Shivya"))
        {
            System.out.println("Username is matched");
        }
        else{
            throw new UserNotFoundException("UserName is not found");
        }
        run();
    }
    public static void run() throws TimeoutException
    {
        throw new TimeoutException();
    }
}
