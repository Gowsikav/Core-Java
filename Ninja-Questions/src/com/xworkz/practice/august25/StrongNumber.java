package com.xworkz.practice.august25;

import java.util.Scanner;

public class StrongNumber {

    public static int getDigits(int num)
    {
        int digit;
        int sum=0;
        while(num>0)
        {
            digit=num%10;
            sum=sum+calculateFactorial(digit);
            num/=10;
        }
        return sum;
    }

    public static int calculateFactorial(int num)
    {
        if(num==0 || num==1)
        {
            return 1;
        }
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Check strong number");
        System.out.println("Enter number: ");
        int num=scanner.nextInt();

        if(num==getDigits(num))
            System.out.println(num+" is strong number");
        else
            System.out.println(num+" is not strong number");
    }
}
