package com.xworkz.jerry.internal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("Bangalore");
        linkedList.add("Salem");
        linkedList.add("Mysore");
        linkedList.add("Coimbatore");
        linkedList.add("Chennai");

        System.out.println("City names");
        for (String name: linkedList)
        {
            System.out.println(name);
        }

        List<String> list=new ArrayList<>();
        list.add("Python");
        list.add("C");
        list.add("C#");
        list.add("Java");
        list.add("C++");
        list.add("Javascript");

        System.out.println("Is list contains Java: "+list.contains("Java"));

        LinkedList<String> list2=new LinkedList<>();
        list2.add("Kho-Kho");
        list2.add("ThrowBall");
        list2.add("BasketBall");
        list2.add("VolleyBall");
        list2.add("Cricket");
        System.out.println("List elements before update: "+list2);
        list2.set(1,"Kabbadi");
        System.out.println("List elements after update: "+list2);

        LinkedList<String> list3=new LinkedList<>();
        list3.add("Cat");
        list3.add("Hai");
        list3.add("Hello");
        list3.add("Dog");
        list3.add("Good");
        System.out.println("List contains Hello: "+list3.contains("Hello"));

    }
}
