package com.xworkz.home.runner;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateParser {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the date(dd-mm-yyyy): ");
        String dateStr=scanner.nextLine();
        try{
            LocalDate date=LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            System.out.println(date);
        }catch(DateTimeParseException e)
        {
            System.out.println(e.getMessage());
        }finally {
            scanner.close();
        }
    }
}
