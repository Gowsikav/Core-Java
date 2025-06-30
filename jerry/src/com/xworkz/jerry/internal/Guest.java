package com.xworkz.jerry.internal;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Guest {
    public static void main(String[] args) {

        Set<String> set=new HashSet<>();
        set.add("Ram");
        set.add("Sam");
        set.add("John");
        set.add("salim");
        set.add("salim");
        set.add(null);
        System.out.println(set);

        System.out.println("Is contains Sam : "+set.contains("Sam"));
        System.out.println("Sam is removed: "+set.remove("Sam"));
        set.clear();
        System.out.println("Size: "+set.size());


        Set<String> tree=new TreeSet<>();
        tree.add("Ram");
        tree.add("Sharmila");
        tree.add("John");
        tree.add("Sangeetha");
        tree.add("Shivya");
       // tree.add(null);
        System.out.println(tree);

        System.out.println("Tree contains salim : "+tree.contains("salim"));

        System.out.println("Size: "+tree.size());

        System.out.println("Tree is empty:"+tree.isEmpty());

        System.out.println("John removed in tree: "+tree.remove("John"));

        Set<String> link=new LinkedHashSet<>();
        link.add("Gowsika");
        link.add("Lakshmi");
        link.add("Santhiya");
        link.add("Sathish");
        link.add("Keerthika");
        link.add("Keerthika");
        link.add(null);

        System.out.println(link);

        System.out.println("LinkedHashSet contains sathish : "+link.contains("Sathish"));
        System.out.println("Size: "+link.size());
        System.out.println("LinkedHashSet is empty: "+link.isEmpty());
        System.out.println("John removed in LinkedHashSet: "+link.remove("John"));

    }
}
