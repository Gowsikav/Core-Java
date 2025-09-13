package com.xworkz.practice.september12;

import java.util.ArrayList;
import java.util.List;

public class ListOfWords {

    public static void main(String[] args) {

        List<String> words=new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("kiwi");
        words.add("orange");
        words.add("mango");

        System.out.println("-- Find the length of each word. ---");
        words.stream().map(word->word+" - "+word.length()+" characters").forEach(System.out::println);

        System.out.println("-- Keep only lengths greater than 4. --");
        words.stream().filter(word->word.length()>4).forEach(System.out::println);

        System.out.println("-- Print average length. --");
        words.stream().mapToInt(String::length).average().ifPresent(System.out::println);
    }
}
