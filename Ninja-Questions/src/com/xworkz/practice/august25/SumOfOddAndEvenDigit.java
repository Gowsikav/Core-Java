package com.xworkz.practice.august25;

import java.util.Scanner;

public class SumOfOddAndEvenDigit {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("sum of even and odd digit in number");
        System.out.println("Enter number: ");
        int num=scanner.nextInt();

        int evenSum=0;
        int oddSum=0;
        while(num>0)
        {
            int digit=num%10;
            if(digit%2==0)
                evenSum+=digit;
            else
                oddSum+=digit;
            num/=10;
        }
        System.out.println("Even sum of digits: "+evenSum);
        System.out.println("Odd sum of digits: "+oddSum);
    }
}
