package com.xworkz.practice.september12;

import java.util.ArrayList;
import java.util.List;

public class ListOfNames {

    public static void main(String[] args) {

        List<String> names=new ArrayList<>();
        names.add("Anil");
        names.add("Sunil");
        names.add("Ravi");
        names.add("Ankit");
        names.add("Suresh");
        names.add("Ramesh");

        System.out.println("-- Filter names starting with A --");
        names.stream().filter(name->name.startsWith("A")).forEach(System.out::println);

        System.out.println("-- Convert them to uppercase. --");
        names.stream().map(String::toUpperCase).forEach(System.out::println);

        System.out.println("-- Print them in alphabetical order. --");
        names.stream().sorted().forEach(System.out::println);
    }
}
