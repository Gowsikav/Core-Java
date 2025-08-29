package com.xworkz.practice.patternprogram;

import java.util.Scanner;

public class Pattern17 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter row: ");
        int row=scanner.nextInt();

        for(int i=1;i<row;i++)
        {
            for(int space=i;space<row;space++)
            {
                System.out.print(" ");
            }
            for(int j=i;j>0;j--)
            {
                System.out.print(j);
            }
            for(int k=2;k<=i;k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
        for(int i=row-2;i>0;i--)
        {
            for(int space=i;space<row;space++)
            {
                System.out.print(" ");
            }
            for(int j=i;j>0;j--)
            {
                System.out.print(j);
            }
            for(int k=2;k<=i;k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
