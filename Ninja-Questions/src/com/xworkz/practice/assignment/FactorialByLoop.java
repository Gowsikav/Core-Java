package com.xworkz.practice.assignment;

import java.util.Scanner;

public class FactorialByLoop {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number: ");
        int num=scanner.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of "+num+" is "+fact);
    }
}
