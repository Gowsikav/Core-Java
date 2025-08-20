package com.xworkz.practice.assignment;

import java.util.Scanner;

public class ArmstrongNumber {

    public static int countDigits(int num)
    {
       int count=0;
        while(num>0)
        {
            num/=10;
            count++;
        }
        return count;
    }

    public static boolean armstrong(int num,int count)
    {
        int number=num;
        int result=0;
        while(num>0)
        {
            int lastDigit=num%10;
            result=result+(int)Math.pow(lastDigit,count);
            num/=10;
        }
        return number==result;
    }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number: ");
        int num=scanner.nextInt();
        int power=countDigits(num);

        if(armstrong(num,power))
        {
            System.out.println(num+ " is ArmStrong number");
        }else {
            System.out.println(num+ " is not ArmStrong number");
        }

    }
}
