package com.xworkz.donkey.runner;

import com.xworkz.donkey.internal.StringChecker;

public class StringCheckerRunner
{
    public static void main(String[] args) {
        StringChecker stringChecker=new StringChecker() {
            @Override
            public String stringCheck(String str) {
                return str;
            }
        };
        String[] arr={"God","Dog","cat","donkey"};
        System.out.println("Strings are ");
        for(String s:arr)
        {
            System.out.println(stringChecker.stringCheck(s));
        }
    }
}
