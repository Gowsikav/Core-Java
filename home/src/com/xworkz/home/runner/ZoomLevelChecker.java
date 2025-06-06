package com.xworkz.home.runner;

import com.xworkz.home.exception.InvalidZoomLevelException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZoomLevelChecker {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int maxZoomLevel=30;
        System.out.println("Enter the Zoom Level(max:30): ");
        try{
            int zoomLevel=scanner.nextInt();
            if(zoomLevel<maxZoomLevel) {
                throw new InvalidZoomLevelException("Zoom level is too high");
            }
            else {
                System.out.println("Zoom level is correct");
            }
        }catch (InputMismatchException e) {
            System.out.println("Input is not correct");
        } catch (InvalidZoomLevelException e) {
            System.out.println(e.getMessage());
        }
    }
}
