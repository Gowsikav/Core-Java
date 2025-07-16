package com.xworkz.demo.runner;

import com.xworkz.demo.internal.Sample;
import com.xworkz.demo.internal.SampleChild;

public class SampleRunner {
    public static void main(String[] args) {
        Sample sample=new Sample();
        System.out.println("Number is " +sample.getNum());
        sample.display();


        SampleChild sampleChild=new SampleChild(10);
        SampleChild.display();
    }
}
