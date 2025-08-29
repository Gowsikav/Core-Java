package com.xworkz.practice.patternprogram;

import java.util.Scanner;

public class LeftTriangleNumber {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter row: ");
        int row=scanner.nextInt();

        int num=1;
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
