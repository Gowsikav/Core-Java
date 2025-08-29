package com.xworkz.practice.patternprogram;

import java.util.Scanner;

public class LeftTriangleAndReverse {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter row: ");
        int row=scanner.nextInt();

        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
        for(int i=row-1;i>=0;i--)
        {
            for(int j=1;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
