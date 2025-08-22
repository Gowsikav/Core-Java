package com.xworkz.practice.august22;

import java.util.Scanner;

public class AverageOfNNumbers {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Average of n numbers");
        System.out.println("Enter the N: ");
        int n= scanner.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter n elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]= scanner.nextInt();
        }

        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("Average of "+n+" elements: "+(sum/n));
    }
}
