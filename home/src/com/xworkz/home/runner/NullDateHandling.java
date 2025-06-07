package com.xworkz.home.runner;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class NullDateHandling {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the date(dd-mm-yyyy):");
        String dateStr=scanner.nextLine();
        try{
            if(dateStr==null || dateStr.isEmpty())
                throw new NullPointerException("Date is empty or null");
            LocalDate date=LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            System.out.println("Date format is correct");

        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        catch (DateTimeParseException e)
        {
            System.out.println("Date format is not correct");
        }
    }
}
