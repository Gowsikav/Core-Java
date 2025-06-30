package com.xworkz.jerry.internal;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> countryList=new TreeSet<>();
        countryList.add("India");
        countryList.add("paris");
        countryList.add("Australia");
        countryList.add("Africa");
        countryList.add("Antarctica");

        System.out.println("Country List: "+countryList);

        TreeSet<Integer> num=new TreeSet<>();
        num.add(73);
        num.add(38);
        num.add(82);
        num.add(20);
        num.add(12);
        System.out.println("Number set elements: "+num);

        TreeSet<Integer> treeSet=new TreeSet<>();
        treeSet.add(23);
        treeSet.add(90);
        treeSet.add(19);
        treeSet.add(56);
        treeSet.add(84);
        System.out.println("Tree set elements: "+treeSet);
        System.out.println("Lowest element: "+treeSet.first());
        System.out.println("Highest element: "+treeSet.last());

        System.out.println("Remove elements less than 50");
        Iterator<Integer> iterator=treeSet.iterator();
        while (iterator.hasNext())
        {
            int n=iterator.next();
            if(n<50)
            {
                iterator.remove();
                System.out.println("Removed element: "+n);
            }
        }

    }
}
