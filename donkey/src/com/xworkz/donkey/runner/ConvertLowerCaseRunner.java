package com.xworkz.donkey.runner;

import com.xworkz.donkey.internal.ConvertLowerCase;

public class ConvertLowerCaseRunner {
    public static void main(String[] args) {
        String[] arr={"GOD","DOG","CAT","DONKEY"};
        ConvertLowerCase convertLowerCase=(string)->{
                System.out.println("Array of strings are convert into lower case");
                for(String s:string)
                    System.out.println(s.toLowerCase());
            };
        convertLowerCase.convert(arr);
    }
}
