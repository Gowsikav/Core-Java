package com.xworkz.practice.september12;

import java.util.Arrays;

public class ArrayOfIntegers {

    public static void main(String[] args) {

        int[] numbers = {5, 2, 9, 1, 7,2,0,9};

        System.out.println("Sorted array");
        Arrays.stream(numbers).sorted().forEach(System.out::println);

        System.out.println("Remove duplicates");
        int[] distinctArray=Arrays.stream(numbers).distinct().toArray();
        System.out.println(Arrays.toString(distinctArray));

        System.out.println("Sorted Distinct list");
        Arrays.stream(distinctArray).sorted().forEach(System.out::println);
    }
}
