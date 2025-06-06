package com.xworkz.home.runner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Game Menu ===");
        System.out.println("1. Start Game");
        System.out.println("2. Load Game");
        System.out.println("3. Exit");

        System.out.print("Choose an option (1-3): ");

        try {
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Starting a new game...");
                    break;
                case 2:
                    System.out.println("Loading game...");
                    break;
                case 3:
                    System.out.println("Exiting. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please select 1, 2, or 3.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number (1-3).");
        }

        scanner.close();
    }
}
