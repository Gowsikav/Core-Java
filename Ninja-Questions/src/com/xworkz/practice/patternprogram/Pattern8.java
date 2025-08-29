package com.xworkz.practice.patternprogram;

import java.util.Scanner;

public class Pattern8 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter row: ");
        int row=scanner.nextInt();

        for(int i=1;i<=row;i++)
        {
            for(int space=row;space>i;space--)
                System.out.print(" ");
            for(int j=1;j<=(2*i)-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
