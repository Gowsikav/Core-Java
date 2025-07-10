package com.xworkz.tom.runner;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {
    public static void main(String[] args) {

        Set<Integer> set=new HashSet<>();
        set.add(1);  //using HashMap set.put(1, PRESENT);  PRESENT--> new Object();
        // for all it is same because map allows value as duplicates
        set.add(null);
        set.add(2);
        set.add(1);
        set.add(null);
        set.add(9);

        System.out.println(set);

        Set<Integer> set2 =new LinkedHashSet<>();
        set2.add(1);
        set2.add(null);
        set2.add(2);
        set2.add(1);
        set2.add(null);
        set2.add(9);

        System.out.println(set2);

        Set<Integer> set3 =new TreeSet<>();
        set3.add(1);
        set3.add(2);
        set3.add(1);
       // set3.add(null);  --> NullPointerException
        set3.add(9);

        System.out.println(set3);


    }
}
