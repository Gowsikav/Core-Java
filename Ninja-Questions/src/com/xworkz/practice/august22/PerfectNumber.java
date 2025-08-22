package com.xworkz.practice.august22;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("find perfect number or not");
        System.out.println("Enter number: ");
        int num=scanner.nextInt();
        int sum=0;
        for(int i=1;i<=num/2;i++)
        {
            if(num%i==0)
            {
                sum+=i;
            }
        }
        if(sum==num)
        {
            System.out.println(num+" is perfect number");
        }else {
            System.out.println(num+" is not perfect number");
        }
    }
}
