package com.xworkz.demo.internal;

import lombok.Getter;

@Getter
public class Sample {
    public Sample()
    {
        System.out.println("Sample constructor");
    }
    int num=10;
    public static void  display(){
        System.out.println("sample");
    }

    protected static class Sample1{
        public Sample1()
        {
            System.out.println("Sample1 inner");
        }
    }
}
