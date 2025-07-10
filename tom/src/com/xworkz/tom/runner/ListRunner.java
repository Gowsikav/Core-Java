package com.xworkz.tom.runner;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListRunner {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        list.add(20); //array
        list.add(10);
        list.add(19);
        list.add(25);
        list.add(12);

        System.out.println(list.subList(1,4));

        List<Integer> list1=new LinkedList<>();
        list1.add(20); // node(null,20,ref10)
        list1.add(10);  // node(ref20,10,ref19)
        list1.add(19);
        list1.add(25);
        list1.add(12);

        System.out.println(list1);

    }
}
