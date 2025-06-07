package com.xworkz.home.runner;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class AgeCalculator {
    public static void main(String[] args) {
        String birthDateStr = "2004-03-30";

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            LocalDate birthDate = LocalDate.parse(birthDateStr, formatter);

            LocalDate today = LocalDate.now();
            Period age = Period.between(birthDate, today);

            System.out.println("Your age is: " + age.getYears() + " years");
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format or value: " + birthDateStr);
        }
    }
}
