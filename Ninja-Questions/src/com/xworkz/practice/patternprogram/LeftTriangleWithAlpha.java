package com.xworkz.practice.patternprogram;

import java.util.Scanner;

public class LeftTriangleWithAlpha {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter row: ");
        int row=scanner.nextInt();

        char start;

        for (int i = 0; i < row; i++) {
            start = (char) ('A' + (row - i - 1));
            for (int j = 0; j <= i; j++) {
                System.out.print(start + " ");
                start++;
            }
            System.out.println();
        }
    }
}
