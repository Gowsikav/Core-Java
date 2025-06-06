package com.xworkz.home.runner;

import com.xworkz.home.exception.NegativeNumberException;

import java.util.Scanner;

public class ImageResizer {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("For Image Resizer give width and height");
        try{
            System.out.println("Enter Width: ");
            int width=scanner.nextInt();
            System.out.println("Enter Height: ");
            int height=scanner.nextInt();
            if(width<0 || height<0)
                throw new NegativeNumberException("Input is negative");
            System.out.println("Image size is resizer");
        }catch (NegativeNumberException e)
        {
            System.out.println("Input is not correct");
        }
    }
}
