package com.xworkz.jerry.internal;


import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {

        Collection<Integer> collection=new ArrayList<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(4);
        collection.add(5);
        collection.add(6);
        collection.add(7);
        collection.add(8);
        collection.add(9);
        collection.add(10);

        System.out.println("Print all elements");
        for(int i:collection)
        {
            System.out.println(i);
        }

        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(29);
        arrayList.add(89);
        arrayList.add(22);
        arrayList.add(56);
        arrayList.add(35);
        arrayList.add(80);
        arrayList.add(10);

        System.out.println("Remove numbers greater than 50");
        Iterator<Integer> iterator =arrayList.iterator();
        while(iterator.hasNext())
        {
            int num=iterator.next();
            if(num>50) {
                iterator.remove();
                System.out.println(num+" removed");
            }
        }

        ArrayList<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Mango");
        list.add("Cherry");

        Collections.sort(list);

        System.out.println("Fruits list in alphabetic order");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(30);
        list2.add(78);
        list2.add(28);
        list2.add(57);
        list2.add(59);

        System.out.println("List elements: "+list2);
        list2.add(2,99);
        System.out.println("List elements after add at index 2: "+list2);

        System.out.println("Size of list: "+list2.size());

        list2.clear();
        System.out.println("List elements after clear: "+list2);

        List<Integer> list3=new ArrayList<>();
        list3.add(783);
        list3.add(47);
        list3.add(10);
        list3.add(306);
        list3.add(79);

        HashSet<Integer> hashSet=new HashSet<>(list3);
        System.out.println("List elements in set: "+hashSet);

        ArrayList<Integer> arrayList1=new ArrayList<>();
        arrayList1.add(24);
        arrayList1.add(74);
        arrayList1.add(95);
        arrayList1.add(29);
        arrayList1.add(40);

        for (int index=0;index<arrayList1.size();index++)
        {
            System.out.println(arrayList1.get(index)+" index is "+index);
        }

        Collections.sort(arrayList1);
        System.out.println("Maximum element in list: "+arrayList1.get(arrayList1.size()-1));

        System.out.println("ArrayList elements: "+arrayList);
        Collections.reverse(arrayList);
        System.out.println("After reverse arrayList elements: "+arrayList);

    }
}
