package com.xworkz.program.internal;

public class VowelConsonantCount {
    public static void main(String[] args) {
        String str="Today is my day, I will do best";
        int vowel=0,consonant=0;
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(c=='a'|| c=='e' ||c=='i' ||c=='o' ||c=='u')
                vowel++;
            else if(c!=' ')
                consonant++;
        }
        System.out.println("input: "+str);
        System.out.println("Vowels count: "+vowel);
        System.out.println("Consonants count: "+consonant);
    }
}
