package com.xworkz.practice.september3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class DuplicatesInArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = scanner.nextInt();
        System.out.println("Enter n elements: ");
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = scanner.nextInt();
        }

        HashSet<Integer> integerHashSet=new HashSet<>();
        LinkedHashSet<Integer> duplicates=new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            if(!integerHashSet.add(num[i]))
            {
                duplicates.add(num[i]);
            }
        }

        if(duplicates.isEmpty())
        {
            System.out.println("No duplicates");
            return;
        }
        System.out.println("duplicates are");
        duplicates.forEach(System.out::println);
    }
}
