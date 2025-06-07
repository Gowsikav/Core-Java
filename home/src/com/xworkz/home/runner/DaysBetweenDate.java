package com.xworkz.home.runner;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DaysBetweenDate {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Give two dates (dd-mm-yyy)");
        System.out.println("Enter first date: ");
        String dateStr1 =scanner.nextLine();
        System.out.println("Enter second date: ");
        String dateStr2 = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try {
            if (dateStr1 == null || dateStr2 == null || dateStr2.isEmpty() || dateStr1.isEmpty()) {
                throw new NullPointerException("One or both date inputs are null.");
            }

            LocalDate date1 = LocalDate.parse(dateStr1, formatter);
            LocalDate date2 = LocalDate.parse(dateStr2, formatter);

            long daysBetween = ChronoUnit.DAYS.between(date1,date2);
            System.out.println("Days between " + date2 + " and " + date1 + ": " + daysBetween);

        } catch (NullPointerException e) {
            System.out.println("Null input: " + e.getMessage());
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Please use yyyy-MM-dd");
        }
        finally {
            scanner.close();
        }
    }
}

