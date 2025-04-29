package com.xworkz.program.internal;

public class SwapStrings
{
    public static void main(String[] args) {
        String str1="Hello";
        String str2="World";
        System.out.println("Before swap:");
        System.out.println("String 1: "+str1+"\nString 2: "+str2);

        str1=str1+str2;
        str2=str1.substring(0,str2.length());
        str1=str1.substring(str2.length());

        System.out.println("\nAfter swap:");
        System.out.println("String 1: "+str1+"\nString 2: "+str2);


    }
}
