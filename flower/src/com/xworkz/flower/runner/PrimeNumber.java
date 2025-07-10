package com.xworkz.flower.runner;

public class PrimeNumber {
    public static void main(String[] args) {
        int num=15;
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                System.out.println("Not prime");
                return;
            }

        }
        System.out.println("Prime number");
    }
}
