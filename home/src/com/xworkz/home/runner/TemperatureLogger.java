package com.xworkz.home.runner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TemperatureLogger {
    public static void main(String[] args) {
        File file=new File("src/com/xworkz/home/file/temperature-log.txt");

        try(Scanner scanner=new Scanner(file))
        {
            System.out.println("File Name: "+file.getName());
            while(scanner.hasNextLine())
            {
                System.out.println(scanner.nextLine());
            }
        }catch (FileNotFoundException e)
        {
            System.out.println("File is not found");
        }
    }
}
