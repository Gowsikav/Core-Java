package com.xworkz.practice.august30;

import java.util.Scanner;

public class ReverseWordInString {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter string: ");
        String str=scanner.nextLine();

        String[] arr=str.split(" ");
        for(String s:arr)
        {
            char[] c=s.toCharArray();
            for(int i=c.length-1;i>=0;i--)
                System.out.print(c[i]);
            System.out.print(" ");
        }
    }
}
