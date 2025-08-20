package com.xworkz.practice.assignment;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number: ");
        int num=scanner.nextInt();

        if(num==0 || num ==1)
        {
            System.out.println("Not prime not composite");
            return;
        }

        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                System.out.println("Not prime number");
                return;
            }
        }
        System.out.println("Prime number");
    }
}

