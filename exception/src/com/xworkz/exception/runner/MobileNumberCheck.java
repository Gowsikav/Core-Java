package com.xworkz.exception.runner;

import com.xworkz.exception.internal.MobileNumberException;

public class MobileNumberCheck {
    public static void main(String[] args) {

        Long number=996566879L;
        String num=number.toString();
        int len=num.length();
        if(len!=10)
        {
            throw new MobileNumberException("Mobile number is invalid");
        }
        else {
            System.out.println("Mobile number is correct");
        }
    }
}
