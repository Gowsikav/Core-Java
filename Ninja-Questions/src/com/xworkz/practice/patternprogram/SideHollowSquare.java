package com.xworkz.practice.patternprogram;

import java.util.Scanner;

public class SideHollowSquare {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row: ");
        int row = scanner.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int space = row; space > i; space--) {
                System.out.print(" ");
            }
            if (i == 1 || i == row) {
                for (int k = 1; k <= row; k++)
                    System.out.print("*");
            } else {
                for (int k = 1; k <= row; k++) {
                    if (k == 1 || k == row)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
