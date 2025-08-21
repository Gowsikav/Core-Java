package com.xworkz.practice.august21;

import java.util.Scanner;

public class PalindromeNumber {

    public static boolean checkPalindrome(int num)
    {
        int reverse=0;
        int number=num;
        while(num>0)
        {
            int digit=num%10;
            reverse=reverse*10+digit;
            num/=10;
        }
        return number==reverse;
    }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number: ");
        int num=scanner.nextInt();

        if(checkPalindrome(num))
            System.out.println(num+" is palindrome");
        else
            System.out.println(num+" is not palindrome");
    }
}
