package com.xworkz.practice.patternprogram;

import java.util.Scanner;

public class Pattern26 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter row: ");
        int n=scanner.nextInt();

        int left = 1;
        int right = n * n + 1;

        for (int i = 0; i < n; i++) {
            for (int space = 0; space < i; space++) {
                System.out.print("  ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print(left++ + " ");
            }
            for (int space = 0; space < (2 * i - 1); space++) {
                System.out.print("  ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print((right++) + " ");
            }
            right = right - (n - i - 1) * 2;

            System.out.println();
        }
    }
}
