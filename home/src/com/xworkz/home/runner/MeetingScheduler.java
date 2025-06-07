package com.xworkz.home.runner;

import com.xworkz.home.exception.MeetingOverlapException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MeetingScheduler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        LocalDateTime existingStart = LocalDateTime.of(2025, 6, 6, 10, 0);
        LocalDateTime existingEnd = existingStart.plusMinutes(60);

        try {
            System.out.print("Enter new meeting date and time (yyyy-MM-dd HH:mm): ");
            String input = scanner.nextLine();
            LocalDateTime newStart = LocalDateTime.parse(input, formatter);

            System.out.print("Enter meeting duration in minutes: ");
            int duration = scanner.nextInt();
            LocalDateTime newEnd = newStart.plusMinutes(duration);

            if (newStart.isBefore(existingEnd) && newEnd.isAfter(existingStart)) {
                throw new MeetingOverlapException("New meeting overlaps with existing meeting: " +
                        existingStart + " to " + existingEnd);
            }

            System.out.println("Meeting scheduled from " + newStart + " to " + newEnd);

        } catch (MeetingOverlapException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter date in format yyyy-MM-dd HH:mm");
        } finally {
            scanner.close();
        }
    }
}
