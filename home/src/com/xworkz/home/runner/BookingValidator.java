package com.xworkz.home.runner;

import com.xworkz.home.exception.PastDateException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class BookingValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter booking date (yyyy-MM-dd): ");
        String input = scanner.nextLine();

        try {
            LocalDate bookingDate = LocalDate.parse(input, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            if (bookingDate.isBefore(LocalDate.now())) {
                throw new PastDateException("Booking date cannot be in the past: " + bookingDate);
            }
            System.out.println("Booking confirmed for: " + bookingDate);
        } catch (PastDateException e) {
            System.out.println("Booking failed: " + e.getMessage());
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Please use yyyy-MM-dd.");
        } finally {
            scanner.close();
        }
    }

}

