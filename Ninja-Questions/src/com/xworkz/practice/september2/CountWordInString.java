package com.xworkz.practice.september2;

import java.util.Scanner;

public class CountWordInString {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter string: ");
        String str=scanner.nextLine();

        String[] arr=str.split(" ");
        System.out.println("Words count: "+arr.length);
    }
}
