package com.xworkz.donkey.runner;

import com.xworkz.donkey.internal.PrimeChecker;

public class PrimeCheckerRunner
{
    public static void main(String[] args)
    {
        PrimeChecker primeChecker=(num)->{
            if (num <= 1)
                return false;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) return false;
            }
            return true;
        };
        int[] nums = {2, 3, 4, 5, 16, 17,-1,0};
        for (int n : nums)
        {
            if(primeChecker.isPrime(n))
                System.out.println(n+ " is prime number");
            else
                System.out.println(n+ " is not a prime number");
        }
    }
}
