package com.xworkz.method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ArraysMethod {
    public static void main(String[] args) {

        List<Integer> list1= new ArrayList<>(Arrays.asList(2, 5, 9, 10));
        System.out.println("Used asList method to convert array into list");
        System.out.println(list1);

        int[] num={7,90,28,57,10,75,3,88,44,92};
        Arrays.sort(num);
        System.out.println("sort method used for ascending order");
        for(int n:num)
            System.out.print(n+" ");

        int index=Arrays.binarySearch(num,88);
        System.out.println("\nUsed binary search. Searched element "+88+" found in index "+index);


        int[] num2=new int[10];
        System.out.println("Used fill method to fill -1 in array");
        Arrays.fill(num2,-1);
        for(int n:num2)
            System.out.print(n+" ");

        String num2Str=Arrays.toString(num2);
        System.out.println("\nUsed toString method it will return string");
        System.out.println("String: "+num2Str);

        int[] num1Copy=Arrays.copyOf(num,11);
        num1Copy[10]=100;
        System.out.println("used copyOf method "+Arrays.toString(num1Copy));

        int[] num2Copy=Arrays.copyOfRange(num2,5,10);
        System.out.println("Used copyOfRange method "+Arrays.toString(num2Copy));


       boolean equaled= Arrays.equals(num,num1Copy);
        System.out.println("Used equals method to compare num1 and num1Copy array: "+equaled);

        int code=Arrays.hashCode(num);
        System.out.println("Used hashCode method in num array: "+code);

        IntStream streamArray=Arrays.stream(num1Copy);
        System.out.println("Used stream method "+Arrays.toString(streamArray.toArray()));

        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{1, 2}, {3, 4}};
        System.out.println("used deepEquals method "+Arrays.deepEquals(a, b));

        System.out.println("used deepToString method "+Arrays.deepToString(a));

        Arrays.setAll(num,n->n*2);
        System.out.println("used set method "+Arrays.toString(num));

        Arrays.parallelSort(num);
        System.out.println("used parallelSort method "+ Arrays.toString(num));
    }
}
