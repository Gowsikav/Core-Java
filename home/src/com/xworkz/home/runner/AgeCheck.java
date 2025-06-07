package com.xworkz.home.runner;

import com.xworkz.home.exception.AgeNotEligibleException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeCheck {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Give the loan application details");

       try {
           System.out.println("Enter Name:");
           String userName = scanner.nextLine();
           System.out.println("Enter dateofbirth:");
           String birthDateStr = scanner.nextLine();
           LocalDate birthDate=LocalDate.parse(birthDateStr,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
           LocalDate dateNow=LocalDate.now();
           long age= ChronoUnit.YEARS.between(birthDate,dateNow);
           System.out.println("Age is "+age);
           if(age<21 || age>60)
               throw new AgeNotEligibleException("Age should be between 21 and 60");
           System.out.println("Loan application is accepted");

       }catch (InputMismatchException e)
       {
           System.out.println("Input is not correct");
       }
       catch (DateTimeParseException e)
       {
           System.out.println("Date format is not correct");
       }
       catch (AgeNotEligibleException e)
       {
           System.out.println(e.getMessage());
           System.out.println("loan application is rejected because of age limit");
       }
       finally {
           scanner.close();
       }
    }
}
