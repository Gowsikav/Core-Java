package com.xworkz.practice.september17;

import java.util.Arrays;
import java.util.Scanner;

public class BuildArrayFromPermutation {

    public static int[] buildArray(int[] nums) {
        int[] temp=new int[nums.length];
        for(int i=0;i<nums.length;i++)
            temp[i]=nums[nums[i]];
        return temp;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=scanner.nextInt();

        System.out.println("Enter array elements: ");
        int[] arr=new int[n];

        for(int i=0;i<n;i++)
            arr[i]= scanner.nextInt();

        int[] nums=buildArray(arr);
        System.out.print("Ans: ");
        System.out.println(Arrays.toString(nums));
    }
}
