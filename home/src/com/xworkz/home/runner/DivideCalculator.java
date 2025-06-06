package com.xworkz.home.runner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideCalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try
        {
            System.out.println("Give two numbers for division operation");
            System.out.println("Enter First Number:");
            int num1=scanner.nextInt();
            System.out.println("Enter Second Number:");
            int num2=scanner.nextInt();
            float div= (float) num1 /num2;
            System.out.println("Division of "+num1+" and "+num2+" is "+div);
        }
        catch (ArithmeticException e)
        {
            System.err.println("Number is not divided by 0");
        }
        catch (InputMismatchException e)
        {
            System.err.println("Input is not correct");
        }
        scanner.close();
    }
}
