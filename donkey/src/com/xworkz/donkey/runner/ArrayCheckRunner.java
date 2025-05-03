package com.xworkz.donkey.runner;

import com.xworkz.donkey.internal.ArrayCheck;

public class ArrayCheckRunner
{
    public static void main(String[] args) {
        int[] arr={2,4,19,38,45,57,50};
        ArrayCheck arrayCheck=(num)->{
            System.out.println("In array of numbers below are even numbers");
            for(int n:num)
            {
                if(n%2==0)
                    System.out.println(n);
            }
        };
        arrayCheck.check(arr);

    }
}
