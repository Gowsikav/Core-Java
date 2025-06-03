package com.xworkz.exception.runner;

import com.xworkz.exception.internal.EmailDomainException;

public class EmailDomainCheck {
    public static void main(String[] args) {
        String email="gowsi@gmail.com";
        if(email.contains(".com"))
        {
            System.out.println("Email contain domain type");
        }
        else{
            throw new EmailDomainException("domain is not there in email");
        }
    }
}
