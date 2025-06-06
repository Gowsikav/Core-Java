package com.xworkz.home.runner;

import com.xworkz.home.exception.EmailCheckException;
import com.xworkz.home.exception.EmailDomainException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmailChecker {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the EmailId: ");
        try{
            String email=scanner.nextLine();
            if(!email.contains("@"))
            {
                throw new EmailCheckException("Email not contain @");
            }
            else {
                System.out.println("Email contain @");
            }
            try{
                if(email.contains(".com"))
                {
                    System.out.println("Email contain domain type");
                    System.out.println("Email is correct");
                }
                else{
                    throw new EmailDomainException("Domain is not present in Email");
                }
            }catch (EmailDomainException e) {
                System.out.println(e.getMessage());
            }
        }
        catch (EmailCheckException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
