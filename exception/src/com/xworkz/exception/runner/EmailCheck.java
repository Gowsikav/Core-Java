package com.xworkz.exception.runner;

import com.xworkz.exception.internal.EmailCheckException;

public class EmailCheck {
    public static void main(String[] args) {
        String email="gowsi07gmail.com";
        if(!email.contains("@"))
        {
            throw new EmailCheckException("Email not contain @");
        }
        else {
            System.out.println("Email contain @");
        }
    }
}
