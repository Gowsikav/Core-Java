package com.xworkz.home.runner;

import com.xworkz.home.exception.NoWiFiConnectionException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WifiConnection {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try{
            System.out.println("Enter the Wi-Fi connection (ON/OFF): ");
            String connected=scanner.nextLine();
            if(connected.equalsIgnoreCase("off")) {
                throw new NoWiFiConnectionException("Wifi is not connected");
            }
            else if(connected.equalsIgnoreCase("on")) {
                System.out.println("Wifi is connected");
            }else{
                throw new InputMismatchException("Input is not correct");
            }
        }catch (InputMismatchException | NoWiFiConnectionException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
