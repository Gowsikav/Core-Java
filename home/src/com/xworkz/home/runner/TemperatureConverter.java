package com.xworkz.home.runner;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the temperature: ");
        String temperature=scanner.nextLine();
        try{
            double temp=Double.parseDouble(temperature);
            System.out.println("Temperature is "+temp);

        } catch (NumberFormatException e) {
            System.out.println("Temperature is wrong");
        }
        finally {
            scanner.close();
        }
    }
}
