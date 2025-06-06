package com.xworkz.home.runner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PlayListReader {
    public static void main(String[] args) {
        File playListFile = new File("src/com/xworkz/home/file/playList.txt");

        try (Scanner scanner = new Scanner(playListFile)) {
            System.out.println("File Name: "+playListFile.getName());
            System.out.println("Your Playlist:");
            while (scanner.hasNextLine()) {
                String song = scanner.nextLine();
                System.out.println("* " + song);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: Playlist file not found.");
        }
    }
}
