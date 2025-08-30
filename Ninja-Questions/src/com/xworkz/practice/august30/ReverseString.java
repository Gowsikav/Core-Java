package com.xworkz.practice.august30;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=scanner.nextLine();
        char[] arr=str.toCharArray();
        System.out.println("Reversed string: ");
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]);
        }
    }
}
