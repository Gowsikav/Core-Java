package com.xworkz.home.runner;

import java.util.Scanner;

public class CoordinateConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter X coordinate: ");
            String xInput = scanner.nextLine();

            System.out.print("Enter Y coordinate: ");
            String yInput = scanner.nextLine();

            try {
                double x = Double.parseDouble(xInput);
                double y = Double.parseDouble(yInput);

                System.out.println("Converted Coordinates:");
                System.out.println("X = " + x);
                System.out.println("Y = " + y);
            } catch (NumberFormatException e) {
                System.out.println("Invalid coordinate value. Please enter numeric values only.");
            }

        } catch (Exception e) {
            System.out.println("Unexpected error occurred: " + e.getMessage());
        }

        scanner.close();
    }
}

