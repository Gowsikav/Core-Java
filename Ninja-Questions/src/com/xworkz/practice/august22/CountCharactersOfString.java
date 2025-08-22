package com.xworkz.practice.august22;

import java.util.Scanner;

public class CountCharactersOfString {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Count vowels,consonants,numbers,spaces in string");
        System.out.println("Enter String: ");
        String str=scanner.nextLine();
        str=str.toLowerCase();
        int vowelCount=0;
        int consonantCount=0;
        int numericCount=0;
        int spaceCount=0;
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(Character.isAlphabetic(c))
            {
                if(c=='a' || c=='e'|| c=='i'|| c=='o'|| c=='u')
                    vowelCount++;
                else consonantCount++;
            }
            if(Character.isDigit(c))
                numericCount++;
            if(Character.isWhitespace(c))
                spaceCount++;
        }

        System.out.println("Vowels count: "+vowelCount);
        System.out.println("Consonant count: "+consonantCount);
        System.out.println("Digits count: "+numericCount);
        System.out.println("Space count: "+spaceCount);
    }
}
