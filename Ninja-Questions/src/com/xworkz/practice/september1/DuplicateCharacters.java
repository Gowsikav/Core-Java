package com.xworkz.practice.september1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharacters {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = scanner.nextLine();

        Map<Character, Integer> characterIntegerMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            characterIntegerMap.put(c, characterIntegerMap.getOrDefault(c, 0) + 1);
        }

        characterIntegerMap.forEach((character, integer) -> System.out.println(character + "  " + integer));
        Set<Map.Entry<Character, Integer>> entries = characterIntegerMap.entrySet();
        System.out.println("Duplicate characters:");
        entries.forEach(characterIntegerEntry -> {
                    if (characterIntegerEntry.getValue() > 1)
                        System.out.println(characterIntegerEntry.getKey());
                });
    }
}
