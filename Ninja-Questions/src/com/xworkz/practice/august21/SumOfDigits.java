package com.xworkz.practice.august21;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number: ");
        int num=scanner.nextInt();
        int sum=0;
        while(num>0)
        {
            sum=sum+num%10;
            num/=10;
        }
        System.out.println("sum of digits: "+sum);
    }
}
