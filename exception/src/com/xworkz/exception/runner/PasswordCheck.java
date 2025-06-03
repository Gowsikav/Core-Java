package com.xworkz.exception.runner;

import com.xworkz.exception.internal.PasswordMisMatchException;

public class PasswordCheck {
    public static void main(String[] args) {
        String password="gows@92";
        if(password.length()<8 || password.length()>16)
        {
            throw new PasswordMisMatchException("Password is not correct");
        }
        else {
            System.out.println("Password is correct");
        }
    }
}
