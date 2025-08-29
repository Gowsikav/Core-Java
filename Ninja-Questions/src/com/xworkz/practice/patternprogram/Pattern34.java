package com.xworkz.practice.patternprogram;

import java.util.Scanner;

public class Pattern34 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter row: ");
        int row=scanner.nextInt();

        for(int i=row;i>=1;i--)
        {
            char c=(char)(65+i-1);
            for(int j=1;j<=i;j++)
            {
                System.out.print(c--);
            }
            System.out.println();
        }
    }
}
