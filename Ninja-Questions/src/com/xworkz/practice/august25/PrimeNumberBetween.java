package com.xworkz.practice.august25;

import java.util.Scanner;

public class PrimeNumberBetween {

    public static boolean checkPrime(int num)
    {
        if(num==0 || num==1)
        {
            return false;
        }
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Prime number between 1 to n");
        System.out.println("Enter n:");
        int n=scanner.nextInt();

        System.out.print("Prime number are ");
        for(int i=1;i<=n;i++)
        {
            if(checkPrime(i))
            {
                System.out.print(i+" ");
            }
        }
    }
}
