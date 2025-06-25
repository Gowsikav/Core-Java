package com.xworkz.jerry.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionRunner {

    public static void main(String[] args) {

        int value1=3;
        int value2=4;
        int value3=5;
        int value4=8;
        int value5=0;

        Collection<Integer>   collection=new ArrayList<>();
        collection.add(value1);// Auto Boxing
        collection.add(value2);// Auto Boxing
        collection.add(value3);// Auto Boxing
        collection.add(value4);// Auto Boxing
        collection.add(value5);// Auto Boxing
        collection.add(value4);//
        System.out.println("Total Values :"+collection.size());


        collection.remove(9);//equals



        Iterator<Integer> iterator=collection.iterator();
        while(iterator.hasNext())
        {
            int value=iterator.next();
            if(value==8)
            {
                iterator.remove();
            }

        }

        System.out.println("Total values after removal :"+collection.size());

    }
}
