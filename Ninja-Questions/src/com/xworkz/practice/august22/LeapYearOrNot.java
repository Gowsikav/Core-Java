package com.xworkz.practice.august22;

import java.time.Year;
import java.util.Scanner;

public class LeapYearOrNot {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Find leap year or not");
        System.out.println("Enter year: ");
        int year=scanner.nextInt();

        if(Year.isLeap(year))
        {
            System.out.println(year+" is leap year");
        }else {
            System.out.println(year+" is not leap year");
        }
    }
}
