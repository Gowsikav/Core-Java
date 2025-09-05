package com.xworkz.practice.september4;

import java.util.Scanner;

public class PermutationRecursive {

    public static void permute(String str,String res)
    {
        if(str.isEmpty())
        {
            System.out.println(res);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            permute(remaining, res + c);
        }
    }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=scanner.nextLine();
        permute(str,"");
    }
}
