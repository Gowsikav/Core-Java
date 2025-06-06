package com.xworkz.home.runner;

import com.xworkz.home.exception.LowBatteryException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DronePercentage {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Drone percentage: ");
        try{
            int percentage=scanner.nextInt();
            if(percentage<10)
            {
                throw new LowBatteryException("Battery is low");
            }

        }catch(InputMismatchException e)
        {
            System.out.println("Input is wrong");
        } catch (LowBatteryException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}
