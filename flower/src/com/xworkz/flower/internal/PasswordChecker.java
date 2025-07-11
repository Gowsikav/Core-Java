package com.xworkz.flower.internal;

import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the password: ");
        String password=scanner.nextLine();

        int upperCase=0;
        int digit=0;
        int speChar=0;

        if (password.length()>8) {
            //System.out.println("Password length at least 8 ");
            for (char ch : password.toCharArray()) {
                if (ch >= 65 && ch <= 90) {
                    upperCase++;
                    //System.out.println("Uppercase");
                }
                if (ch >= 48 && ch <= 57) {
                    digit++;
                    //System.out.println("digit");
                }
                if (ch == '!' || ch == '@' || ch == '#' || ch == '$' || ch == '%' || ch == '^' || ch == '&' || ch == '*') {
                    speChar++;
                    //System.out.println("special character");
                }
            }
        }else {
            System.out.println("length is mismatch");
        }
        if(upperCase>=1 && digit>=1 && speChar >=1)
        {
            System.out.println("Strong");
        }
        else {
            System.out.println("Weak");
        }
    }
}
