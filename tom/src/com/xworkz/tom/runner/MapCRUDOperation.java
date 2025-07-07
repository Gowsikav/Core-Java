package com.xworkz.tom.runner;

import java.util.HashMap;
import java.util.Map;

public class MapCRUDOperation {
    public static void main(String[] args) {

        Map<Integer,String> fruitList=new HashMap<>();
        fruitList.put(1,"Apple");
        fruitList.put(2,"Banana");
        fruitList.put(3,"Grapes");
        fruitList.put(4,"Guava");
        fruitList.put(5,"Orange");
        fruitList.put(6,"PineApple");
        fruitList.put(7,"Mango");
        fruitList.put(8,"Custard Apple");
        fruitList.put(9,"Strawberry");
        fruitList.put(10,"BlueBerry");

        System.out.println("Fruit list");
        for(String name:fruitList.values())
        {
            System.out.println(name);
        }

        System.out.println("Fruit at index 3: "+fruitList.get(3));

        System.out.println("Apple Removed: "+fruitList.remove(8,"Apple"));

        System.out.println("Removed Fruit: "+fruitList.remove(8));

        System.out.println("Size of fruit list: "+fruitList.size());

        System.out.println(fruitList);

        System.out.println("Replaced fruit: "+fruitList.replace(9,"JackFruit"));

        System.out.println(fruitList);

        System.out.println("Apple replaced: "+fruitList.replace(1,"Apple","Pomegranate"));

    }
}
