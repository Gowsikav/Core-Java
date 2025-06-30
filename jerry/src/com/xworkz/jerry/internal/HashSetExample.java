package com.xworkz.jerry.internal;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> fruitList=new HashSet<>();
        fruitList.add("Apple");
        fruitList.add("Mango");
        fruitList.add("pineapple");
        fruitList.add("Grapes");
        fruitList.add("Apple");
        fruitList.add("pomegranate");

        System.out.println("Fruits List: "+fruitList);

        LinkedHashSet<Integer> linkedHashSet= new LinkedHashSet<>();
        linkedHashSet.add(5);
        linkedHashSet.add(10);
        linkedHashSet.add(15);
        linkedHashSet.add(10);
        linkedHashSet.add(20);

        System.out.println("List: "+linkedHashSet);

        HashSet<Integer> set1=new HashSet<>();
        System.out.println("Is set is empty: "+set1.isEmpty());

        HashSet<Integer> set2=new HashSet<>();
        set2.add(2);
        set2.add(4);
        set2.add(6);
        set2.add(8);
        System.out.println("Set elements: "+set2);
        set2.remove(6);
        System.out.println("Set elements after remove 6: "+set2);

        System.out.println("Is set contains Banana: "+fruitList.contains("Banana"));

        LinkedHashSet<Integer> set3=new LinkedHashSet<>();
        set3.add(12);
        set3.add(84);
        set3.add(63);
        set3.add(18);
        set3.add(74);
        set3.add(28);

        System.out.println("print elements using iterator");
        Iterator<Integer> iterator=set3.iterator();
        while(iterator.hasNext())
        {
            int num=iterator.next();
            System.out.println(num);
        }

        System.out.println("Converted hashset into list");
        ArrayList<Integer> arrayList=new ArrayList<>(set3);
        System.out.println("After convert into list: "+arrayList);

    }
}
