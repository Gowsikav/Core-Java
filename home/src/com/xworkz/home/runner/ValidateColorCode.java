package com.xworkz.home.runner;

import com.xworkz.home.exception.InvalidColorCodeException;

import java.util.Scanner;

public class ValidateColorCode {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Color code: ");
        try{
            String code=scanner.nextLine();
            if(code==null || code.isEmpty())
                throw new NullPointerException("Code should not be empty");
            if(code.matches("^#[A-Fa-f0-9]{6}$"))
            {
                throw new InvalidColorCodeException("Color code is wrong");
            }
        } catch (NullPointerException | InvalidColorCodeException e) {
            System.out.println(e.getMessage());
        }
    }
}
