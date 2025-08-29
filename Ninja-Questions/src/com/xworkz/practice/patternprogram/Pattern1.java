package com.xworkz.practice.patternprogram;

import java.util.Scanner;

public class Pattern1 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter row and column as same: ");
        int row=scanner.nextInt();
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=row;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
