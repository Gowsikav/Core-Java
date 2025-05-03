package com.xworkz.donkey.runner;

import com.xworkz.donkey.internal.EvenOrOdd;

public class EvenOrOddRunner
{
    public static void main(String[] args) {

        EvenOrOdd evenOrOdd=new EvenOrOdd() {
            @Override
            public void check(int n) {
                if(n%2==0)
                    System.out.println(n+" is Even number");
                else
                    System.out.println(n+" is Odd number");
            }
        };
        EvenOrOdd evenOrOdd1=(n)->{
            if(n%2!=0)
                System.out.println(n+" is Odd number");
            else
                System.out.println(n+" is Even number");
        };
        evenOrOdd.check(32);
        evenOrOdd1.check(17);

    }
}
