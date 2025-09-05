package com.xworkz.practice.september4;

import java.util.Scanner;

public class PermutationLoop {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=scanner.nextLine();

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < str.length(); k++) {
                    if (i != j && j != k && i != k) {
                        System.out.println("" + str.charAt(i) + str.charAt(j) + str.charAt(k));
                    }
                }
            }
        }
    }
}
