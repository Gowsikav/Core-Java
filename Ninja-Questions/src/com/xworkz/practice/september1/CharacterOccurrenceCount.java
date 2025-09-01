package com.xworkz.practice.september1;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class CharacterOccurrenceCount {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter string: ");
        String str=scanner.nextLine();

        LinkedHashMap<Character,Integer> hashMap=new LinkedHashMap<>();

        for(char c:str.toCharArray())
        {
            hashMap.put(c, hashMap.getOrDefault(c,0)+1);
        }
        System.out.println("Character occurrence count");
        hashMap.forEach((character, integer) -> System.out.println(character+" - "+integer));
    }
}
