package com.xworkz.home.runner;

import java.time.LocalTime;

public class EventSchedulingValidator {

    public static void main(String[] args) {

        LocalTime firstEventStart = LocalTime.of(9, 0);
        LocalTime firstEventEnd   = LocalTime.of(10, 30);

        LocalTime secondEventStart = LocalTime.of(10, 45);
        LocalTime secondEventEnd   = LocalTime.of(12, 0);

        try {
            if(secondEventStart.isBefore(firstEventEnd))
                throw new IllegalArgumentException("Second event is start before first event end (Invalid)");
            if (firstEventStart.isAfter(firstEventEnd) || secondEventStart.isAfter(secondEventEnd)) {
                throw new IllegalArgumentException("Start time cannot be after end time.");
            }
            System.out.println("Events scheduled successfully.");
        } catch (IllegalArgumentException e) {
            System.out.println("Scheduling conflict: " + e.getMessage());
        }
    }

}

