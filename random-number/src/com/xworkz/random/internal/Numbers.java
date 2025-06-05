package com.xworkz.random.internal;

import java.util.Random;

public class Numbers {
    public static void main(String[] args) {
        Random random=new Random();
        System.out.println("Integer "+random.nextInt());
        System.out.println("Integer "+random.nextInt(20));
        System.out.println("Long "+random.nextLong());
        System.out.println("Double "+random.nextDouble());
        System.out.println("Float "+random.nextFloat());
        System.out.println("Boolean "+random.nextBoolean());

        System.out.println("===========================");

        Random random1 =new Random(35);
        System.out.println("Integer "+ random1.nextInt());
        System.out.println("Integer "+ random1.nextInt(20));
        System.out.println("Long "+ random1.nextLong());
        System.out.println("Double "+ random1.nextDouble());
        System.out.println("Float "+ random1.nextFloat());
        System.out.println("Boolean "+ random1.nextBoolean());

    }
}
