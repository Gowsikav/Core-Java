package com.xworkz.tom.runner;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {
    public static void main(String[] args) {

        Map<String,Integer> map=new HashMap<>();
        map.put("Apple",10);
        map.put("Banana",12);
        map.put("Pineapple",5);
        map.put("Orange",18);
        map.put("Guava",20);
        map.put("Strawberry",26);
        map.put("Custard Apple",2);

        System.out.println(map.get("Pineapple"));
        System.out.println("Map has banana: "+map.containsKey("Banana"));
        System.out.println("Map has value 10: "+map.containsValue(10));
        System.out.println("Removed value: "+map.remove("Custard Apple"));
        System.out.println("Map Size: "+map.size());
        System.out.println("Map is empty: "+map.isEmpty());

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("cherry", 30);
        map.putAll(map2);

        System.out.println(map.getOrDefault("Guava", 0));

        System.out.println("Replaced value: "+map.replace("cherry",25));
        System.out.println(map);

        map.putIfAbsent("date", 100);
        System.out.println(map);

        map.computeIfPresent("date", (k, v) -> v + 1);
        System.out.println(map);

        map.putIfAbsent("Orange",20);
        System.out.println(map);

        map.merge("Banana",4, Integer::sum);
        System.out.println(map);

        map.compute("Strawberry",(k,v)->v==null?25:20);
        System.out.println(map);
    }
}
