package com.xworkz.practice.september4;

import java.util.Scanner;

public class Search {

    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=scanner.nextInt();

        System.out.println("Enter array elements: ");
        int[] num=new int[n];
        for(int i=0;i<n;i++)
            num[i]=scanner.nextInt();

        System.out.println("Enter the search element: ");
        int find=scanner.nextInt();

        int index=search(num,find);
        if(index==-1)
            System.out.println("Not found");
        else
            System.out.println("Found at "+index);
    }
}
