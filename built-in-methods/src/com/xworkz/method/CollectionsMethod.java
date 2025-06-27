package com.xworkz.method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsMethod {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);
        Collections.sort(list);
        System.out.println("Used sort method "+list);

        Collections.reverse(list);
        System.out.println("Used reverse method "+list);

        Collections.shuffle(list);
        System.out.println("Used shuffle method "+list);

        System.out.println("Used emptyList method "+Collections.emptyList());


        System.out.println("Used max method "+Collections.max(list));

        System.out.println("Used min method "+Collections.min(list));

        List<String> names = Arrays.asList("god", "nature", "god");
        int freq = Collections.frequency(names, "god");
        System.out.println("used frequency method "+freq);

        boolean replaced=Collections.replaceAll(names,"nature","sea");
        System.out.println("used replaceAll method "+replaced);

        System.out.println("used binary search method "+Collections.binarySearch(list,0));

        List<Integer> list2 = new ArrayList<>();
        list2.add(30);
        Collections.copy(list,list2);
        System.out.println("used copy method "+list);


        Collections.fill(list2,-2);
        System.out.println("Used fill method "+list2);

        Collections.swap(list,1,2);
        System.out.println("used swap method "+list);

        Collections.reverse(list);
        System.out.println("used reverseOrder method "+list);

        list2=Collections.unmodifiableList(list2);
        System.out.println("used unmodifiableList method "+list2);

        Collections.rotate(list,2);
        System.out.println("used rotate method "+list);

    }
}
