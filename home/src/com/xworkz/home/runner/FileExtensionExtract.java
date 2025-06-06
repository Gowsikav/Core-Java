package com.xworkz.home.runner;

import java.util.Scanner;

public class FileExtensionExtract {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the fileName with Extension: ");
        String fileName=scanner.nextLine();
        try{
            int index=fileName.lastIndexOf(".");
            String extension=fileName.substring(index);
            System.out.println("File extension is "+extension);
        }catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("String is out of index");
        }
        scanner.close();
    }
}
