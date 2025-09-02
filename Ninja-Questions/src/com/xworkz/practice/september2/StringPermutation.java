package com.xworkz.practice.september2;

import java.util.Scanner;

public class StringPermutation {

    public static void permutation(String str,String res)
    {
        if(str.isEmpty())
        {
            System.out.println(res);
            return;
        }

        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            String remain=str.substring(0,i)+str.substring(i+1);
            permutation(remain,res+c);
        }
    }
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter string: ");
        String str=scanner.nextLine();
        permutation(str,"");

    }
}
