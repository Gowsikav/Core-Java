package com.xworkz.practice.patternprogram;

import java.util.Scanner;

public class Pattern33 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter row: ");
        int row=scanner.nextInt();

        int count=0;
        char c=(char)97;
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(count%2!=0)
                {
                    System.out.print(Character.toUpperCase(c)+" ");
                }else
                   System.out.print(c+" ");
                count++;
                c++;
            }
            System.out.println();
        }
    }
}
