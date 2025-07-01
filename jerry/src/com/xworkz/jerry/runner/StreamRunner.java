package com.xworkz.jerry.runner;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamRunner {

    public static void main(String[] args) {

// Object,Thread,Collection,String + 48 keywords
        Collection<Integer> collection=new LinkedList<>();
        collection.add(34);
        collection.add(88);
        collection.add(96);
        collection.add(51);
        collection.add(67);
        collection.add(42);


        Collection<Integer> collection1=new LinkedList<>();

        for(Integer integer:collection)
        {
            if(integer>50)
            {
                System.out.println("integer is greater > 50 : "+integer);
                collection1.add(integer);
            }

        }
        System.out.println("List contain elements which are greater than 50");
        System.out.println(collection1);

        System.out.println("Using streams");
        long len=collection.stream().filter(e->e>50).count();
        System.out.println("Count of elements: "+len);

        System.out.println("List of elements ");
        collection.stream().filter(e -> e > 50).sorted().forEach(e -> System.out.print(e+" "));

        List<Integer> list=collection.stream().filter(e->e<50).collect(Collectors.toList());
        System.out.println("\nUsed collect to convert into list ");
        System.out.println("Elements which are less than 50: "+list);

        list.add(30);
        list.add(20);
        list.add(43);
        list.add(30);
        list.add(98);
        list.add(42);
        System.out.println("List with duplicates ");
        System.out.println(list);
        System.out.println("Used streams to reduce duplicates ");
        Stream<Integer> stream=list.stream().distinct();
        stream.forEach(e-> System.out.print(e+" "));

        System.out.println("\nAll element is less than 50: "+list.stream().allMatch(e->e<50));
        System.out.println("Any element is less than 50: "+list.stream().anyMatch(e->e<50));

    }
}
