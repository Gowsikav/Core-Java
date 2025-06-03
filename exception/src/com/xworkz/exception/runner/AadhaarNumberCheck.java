package com.xworkz.exception.runner;

import com.xworkz.exception.internal.AadhaarNumberCheckException;

public class AadhaarNumberCheck {
    public static void main(String[] args) {
        Long myLong = 2536738272393L;
        String longString = myLong.toString();
        int length = longString.length();
        if(length<12 || length>12)
        {
            throw new AadhaarNumberCheckException("Aadhaar number is not correct");
        }
        else {
            System.out.println("Aadhaar number is correct");
        }

    }
}
