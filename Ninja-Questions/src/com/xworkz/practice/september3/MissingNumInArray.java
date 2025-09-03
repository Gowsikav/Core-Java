package com.xworkz.practice.september3;

import java.util.Scanner;

public class MissingNumInArray {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=scanner.nextInt();

        System.out.println("Enter no of elements in array: ");
        int arrSize=scanner.nextInt();
        System.out.println("Enter n elements: ");
        int[] num=new int[arrSize];
        int sum=0;
        for(int i=0;i<arrSize;i++) {
            num[i] = scanner.nextInt();
            sum+=num[i];
        }

        int total=(n*(n+1))/2;
        System.out.println("missing number: "+(total-sum));
    }
}
