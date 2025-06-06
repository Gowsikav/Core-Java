package com.xworkz.home.runner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BackupFileLoader {

    public static void main(String[] args) {
        File file = new File("src/com/xworkz/home/file/test.txt");

        try(Scanner scanner = new Scanner(file)) {
            System.out.println("Loading from: " + file.getName());
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("test file not found.");
        }
    }

}
