package com.xworkz.practice.august21;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number: ");
        int  num=scanner.nextInt();
        int first = 0;
        int second = 1;

        System.out.print("Fibonacci series: ");
        for (int i = 0; i < num; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
