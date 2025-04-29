package com.xworkz.program.internal;

import java.util.Arrays;

public class CamelCaseString
{
    public static String convert(String s)
    {
        char[] c=s.toCharArray();
        char ch=c[0];
        int num=(int)ch;
        num-=32;
        ch=(char)num;
        c[0]=ch;
        return String.valueOf(c);
    }
    public static void main(String[] args) {
        String str="hello how are you all set to go home";
        String[] arr= str.split(" ");
        System.out.println("input: "+str);
        System.out.print("output: ");
        for(String s:arr)
        {
            System.out.print(convert(s)+" ");

        }
    }
}
