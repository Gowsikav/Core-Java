package com.xworkz.demo.internal;

public class SampleChild extends Sample{
    private SampleChild()
    {
        System.out.println("SampleChild constructor");
    }

   public static void display()
    {
        System.out.println("SampleChild");
    }

    public SampleChild(int num)
    {
        this();
        System.out.println("num: "+num);
        Sample1 sample1=new Sample1();
    }


}
