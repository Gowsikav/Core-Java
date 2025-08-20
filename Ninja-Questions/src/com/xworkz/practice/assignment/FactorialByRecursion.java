package com.xworkz.practice.assignment;

import java.util.Scanner;

public class FactorialByRecursion {

    public static int factorial(int num)
    {
        if(num==0 || num==1)
            return 1;
        return num*factorial(num-1);
    }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number:");
        int num=scanner.nextInt();
        System.out.println(num+" Factorial is "+factorial(num));
    }
}
