package com.xworkz.practice.september4;

import java.util.Scanner;

public class FibonacciLoop {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=scanner.nextInt();

        int first=0;
        int second=1;
        int third;
        System.out.print("Fibonacci series: ");
        for(int i=1;i<=n;i++)
        {
            System.out.print(first+" ");
            third=first+second;
            first=second;
            second=third;
        }
    }
}
