package com.xworkz.practice.patternprogram;

import java.util.Scanner;

public class Pattern10 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter row: ");
        int row=scanner.nextInt();

        for(int i=1;i<=row;i++)
        {
            for(int space=1;space<=row-i;space++)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
