package com.xworkz.practice.august22;

import java.util.Scanner;

public class LCMAndGCD {

    public static int calculateGCD(int num1,int num2)
    {
        while(num2!=0)
        {
            int temp=num2;
            num2=num1%num2;
            num1=temp;
        }
        return num1;
    }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("find lcm and gcd for two numbers");
        System.out.println("Enter number1: ");
        int num1=scanner.nextInt();
        System.out.println("Enter number2: ");
        int num2=scanner.nextInt();

        int multiple=num1*num2;
        int GCD=calculateGCD(num1,num2);
        System.out.println("LCM: "+(multiple/GCD));
        System.out.println("GCD: "+ GCD);
    }
}
