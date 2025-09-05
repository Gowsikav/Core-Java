package com.xworkz.practice.september4;

import java.util.Arrays;
import java.util.Scanner;

public class LargestAndSmallest {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n= scanner.nextInt();

        System.out.println("Enter array elements: ");
        int[] num=new int[n];

        for(int i=0;i<n;i++)
        {
            num[i]= scanner.nextInt();
        }

        System.out.println("Largest element: "+(Arrays.stream(num).max()).getAsInt());
        System.out.println("Smallest element: " +(Arrays.stream(num).min()).getAsInt());

    }
}
