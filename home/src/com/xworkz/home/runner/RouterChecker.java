package com.xworkz.home.runner;

import com.xworkz.home.exception.RouteNotFoundException;

import java.util.Scanner;

public class RouterChecker {
    public static void main(String[] args) {
        String source = "salem";
        String destination = "bangalore";
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter source: ");
        String userSource=scanner.nextLine();
        System.out.println("Enter destination: ");
        String userDestination=scanner.nextLine();

        try {
            System.out.println("Route found from " + source + " to " + destination);
            if (!(userSource.equalsIgnoreCase(source) && userDestination.equalsIgnoreCase(destination))) {
                throw new RouteNotFoundException("Route not found between " + source + " and " + destination);
            }
        } catch (RouteNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
