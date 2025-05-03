package com.xworkz.donkey.runner;

import com.xworkz.donkey.internal.SubStringChecker;

public class SubStringCheckerRunner
{
    public static void main(String[] args) {
        String[] arr={"Hello","world","Java","oops"};
        SubStringChecker subStringChecker=new SubStringChecker() {
            @Override
            public void check(String[] s) {
                System.out.println("These Strings contains the substring lo ");
                for(String str:s)
                {
                    if(str.contains("lo"))
                        System.out.println(str);
                }
            }
        };
        subStringChecker.check(arr);
    }
}
