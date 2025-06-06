package com.xworkz.home.runner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShoppingListFetcher {
    public static void main(String[] args) {
        String[] shoppingList = {"Milk", "Bread", "Eggs", "Butter", "Cheese"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Shopping List ===");
        for (int i = 0; i < shoppingList.length; i++) {
            System.out.println(i + ": " + shoppingList[i]);
        }

        System.out.print("\nEnter the index of the item you want to fetch: ");

        try {
            int index = scanner.nextInt();
            String item = shoppingList[index];
            System.out.println("Item at index " + index + ": " + item);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index enter a number between 0 and " + (shoppingList.length - 1) + ".");
        } catch (InputMismatchException e)
        {
            System.out.println("Input is not correct");
        }

        scanner.close();
    }
}

