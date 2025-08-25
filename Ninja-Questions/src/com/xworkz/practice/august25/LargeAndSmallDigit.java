package com.xworkz.practice.august25;

import java.util.Scanner;

public class LargeAndSmallDigit {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Largest and Smallest digit in number");
        System.out.println("Enter number: ");
        int num=scanner.nextInt();

        int large=num%10;
        int small=num%10;
        while(num>0)
        {
            int digit=num%10;
            if(digit>large)
                large=digit;
            if(digit<small)
                small=digit;
            num/=10;
        }

        System.out.println("Largest digit in number: "+large);
        System.out.println("Smallest digit in number: "+small);
    }
}
