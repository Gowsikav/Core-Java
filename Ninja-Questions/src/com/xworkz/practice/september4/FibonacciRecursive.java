package com.xworkz.practice.september4;

import java.util.Scanner;

public class FibonacciRecursive {

    private static int fibonacci(int n)
    {
        if(n==1)
            return 0;
        if(n<=3)
        {
           return 1;
        }


        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=scanner.nextInt();

        System.out.print("Fibonacci series: ");
        for(int i=1;i<=n;i++) {
            System.out.print(fibonacci(i)+" ");
        }
    }
}
