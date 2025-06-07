package com.xworkz.home.runner;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class LeapYearBirthdateValidator {
    public static void main(String[] args) {
        String birthDateStr = "29-02-2023";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        try {
            LocalDate birthDate = LocalDate.parse(birthDateStr, formatter);
            System.out.println("Valid birthdate: " + birthDate);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid birthdate. Check if the year is a leap year for February 29.");
        }
    }
}

