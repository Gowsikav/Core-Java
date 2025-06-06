package com.xworkz.home.runner;

import java.util.Scanner;

public class SlopeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coordinates of the first point:");
        System.out.print("x1 = ");
        double x1 = scanner.nextDouble();
        System.out.print("y1 = ");
        double y1 = scanner.nextDouble();

        System.out.println("Enter coordinates of the second point:");
        System.out.print("x2 = ");
        double x2 = scanner.nextDouble();
        System.out.print("y2 = ");
        double y2 = scanner.nextDouble();

        try {
            if (x1 == x2) {
                throw new ArithmeticException("Slope is undefined (vertical line).");
            }

            double slope = (y2 - y1) / (x2 - x1);
            System.out.println("Slope of the line: " + slope);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}

