package com.xworkz.home.runner;

import java.util.Scanner;

public class NickName {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try
        {
            System.out.println("Enter your NickName: ");
            String name=scanner.nextLine();
            if(name==null || name.isEmpty())
                throw new NullPointerException();
            System.out.println("Nick name: "+name);
        }catch (NullPointerException e)
        {
            System.out.println("Nick name cannot be null");
        }
        scanner.close();
    }
}
