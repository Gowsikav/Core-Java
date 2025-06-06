package com.xworkz.home.runner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RatingInput {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the rating: ");
        try{
            float rating=scanner.nextFloat();
            System.out.println("Ratings is "+rating);
        }catch (InputMismatchException e)
        {
            System.out.println("Input is not correct");
        }
        scanner.close();
    }
}
