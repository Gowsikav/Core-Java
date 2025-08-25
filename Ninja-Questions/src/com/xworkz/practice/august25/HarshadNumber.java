package com.xworkz.practice.august25;

import java.util.Scanner;

public class HarshadNumber {

    public static int calculateDigits(int num)
    {
        int sum=0;
        while(num>0)
        {
            sum=sum+num%10;
            num/=10;
        }
        return sum;
    }
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("check Harshad number");
        System.out.println("Enter number: ");
        int num=scanner.nextInt();
        int sumOfDigits=calculateDigits(num);
        if(num%sumOfDigits==0)
        {
            System.out.println(num+ " is harshad number");
        }else {
            System.out.println(num+ " is not harshad number");
        }
    }
}
