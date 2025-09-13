package com.xworkz.practice.september12;

import java.util.Arrays;

public class ArrayOfNumbers {

    public static void main(String[] args) {

        int[] numbers={20,19,30,10,9,2,200,190,300,680};

        System.out.println("-- Multiply each by 10. --");
        Arrays.stream(numbers).map(number->number*10).forEach(System.out::println);

        System.out.println("-- Keep only numbers greater than 200. --");
        Arrays.stream(numbers).filter(number->number>200).forEach(System.out::println);

        System.out.println("-- Print them and find the average. --");
        System.out.println(Arrays.toString(numbers));
        Arrays.stream(numbers).average().ifPresent(num-> System.out.println("Average: "+num));
    }
}
