package com.xworkz.donkey.runner;

import com.xworkz.donkey.internal.PrintString;

public class PrintStringRunner
{
    public static void main(String[] args) {
        String[] str={"Welcome","Java","Course","Inheritance","Abstraction","Encapsulation"};
        PrintString printString=(arr,len)->{
            System.out.println("Below strings are greater than length "+len);
            for(String s:arr)
            {
                if(s.length()>len)
                    System.out.println(s);
            }
        };
        printString.print(str,7);
    }
}
