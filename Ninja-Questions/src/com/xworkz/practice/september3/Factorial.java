package com.xworkz.practice.september3;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=scanner.nextInt();

        int fact=1;
        for(int i=1;i<=n;i++)
            fact*=i;

        System.out.println(n+"!= "+fact);

    }
}
