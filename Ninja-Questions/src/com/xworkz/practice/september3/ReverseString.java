package com.xworkz.practice.september3;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=scanner.nextLine();

        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.println("Reversed string: "+rev);
    }
}
