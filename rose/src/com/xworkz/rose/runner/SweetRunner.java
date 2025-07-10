package com.xworkz.rose.runner;

import com.xworkz.rose.dto.SweetDTO;

import java.util.*;

public class SweetRunner {
    public static void main(String[] args) {

        Set<SweetDTO> set=new LinkedHashSet<>();

        SweetDTO sweetDTO1 = new SweetDTO("Cake", 30, new String[]{"Maida", "Water", "Milk", "Egg", "Baking soda"}, 2, 3);
        SweetDTO sweetDTO2 = new SweetDTO("Ladoo", 15, new String[]{"Besan", "Sugar", "Ghee", "Cardamom"}, 10, 2);
        SweetDTO sweetDTO3 = new SweetDTO("Jalebi", 25, new String[]{"Maida", "Sugar", "Saffron", "Lemon juice"}, 8, 1);
        SweetDTO sweetDTO4 = new SweetDTO("Rasgulla", 35, new String[]{"Milk", "Lemon", "Sugar", "Water"}, 6, 4);
        SweetDTO sweetDTO5 = new SweetDTO("Kaju Katli", 50, new String[]{"Cashew", "Sugar", "Ghee", "Cardamom"}, 5, 2);
        SweetDTO sweetDTO6 = new SweetDTO("Barfi", 40, new String[]{"Milk", "Sugar", "Ghee", "Cardamom"}, 7, 2);
        SweetDTO sweetDTO7 = new SweetDTO("Halwa", 20, new String[]{"Sooji", "Sugar", "Ghee", "Water"}, 6, 3);
        SweetDTO sweetDTO8 = new SweetDTO("Peda", 25, new String[]{"Milk", "Sugar", "Cardamom"}, 12, 2);
        SweetDTO sweetDTO9 = new SweetDTO("Modak", 30, new String[]{"Rice flour", "Jaggery", "Coconut"}, 10, 1);
        SweetDTO sweetDTO10 = new SweetDTO("Kheer", 35, new String[]{"Milk", "Rice", "Sugar", "Cardamom", "Dry fruits"}, 4, 1);

        SweetDTO sweetDTO11 = new SweetDTO("Gulab Jamun", 45, new String[]{"Khoya", "Sugar", "Rose water", "Cardamom"}, 8, 3);
        SweetDTO sweetDTO12 = new SweetDTO("Sandesh", 38, new String[]{"Chenna", "Sugar", "Saffron"}, 5, 2);
        SweetDTO sweetDTO13 = new SweetDTO("Mysore Pak", 50, new String[]{"Besan", "Sugar", "Ghee"}, 6, 1);
        SweetDTO sweetDTO14 = new SweetDTO("Malpua", 28, new String[]{"Flour", "Milk", "Sugar", "Fennel seeds"}, 4, 2);
        SweetDTO sweetDTO15 = new SweetDTO("Shrikhand", 32, new String[]{"Curd", "Sugar", "Cardamom", "Saffron"}, 3, 1);
        SweetDTO sweetDTO16 = new SweetDTO("Rabri", 55, new String[]{"Milk", "Sugar", "Dry fruits", "Cardamom"}, 3, 2);
        SweetDTO sweetDTO17 = new SweetDTO("Balushahi", 45, new String[]{"Flour", "Sugar", "Ghee", "Yogurt"}, 6, 3);
        SweetDTO sweetDTO18 = new SweetDTO("Imarti", 30, new String[]{"Urad dal", "Sugar", "Ghee"}, 9, 1);
        SweetDTO sweetDTO19 = new SweetDTO("Khoya", 20, new String[]{"Milk", "Sugar"}, 10, 2);
        SweetDTO sweetDTO20 = new SweetDTO("Badam Halwa", 60, new String[]{"Almond", "Sugar", "Ghee", "Milk"}, 4, 1);

        SweetDTO sweetDTO21 = new SweetDTO("Rava Kesari", 27, new String[]{"Sooji", "Sugar", "Ghee", "Saffron"}, 7, 2);
        SweetDTO sweetDTO22 = new SweetDTO("Pineapple Sheera", 30, new String[]{"Sooji", "Sugar", "Ghee", "Pineapple"}, 5, 2);
        SweetDTO sweetDTO23 = new SweetDTO("Payasam", 38, new String[]{"Milk", "Rice", "Jaggery", "Cardamom", "Cashew"}, 5, 2);
        SweetDTO sweetDTO24 = new SweetDTO("Chikki", 22, new String[]{"Jaggery", "Peanuts"}, 15, 3);
        SweetDTO sweetDTO25 = new SweetDTO("Tilgul", 18, new String[]{"Sesame", "Jaggery"}, 20, 1);
        SweetDTO sweetDTO26 = new SweetDTO("Kalakand", 42, new String[]{"Milk", "Sugar", "Cardamom", "Paneer"}, 6, 2);
        SweetDTO sweetDTO27 = new SweetDTO("Double Ka Meetha", 48, new String[]{"Bread", "Milk", "Sugar", "Dry fruits", "Ghee"}, 4, 1);
        SweetDTO sweetDTO28 = new SweetDTO("Phirni", 35, new String[]{"Rice", "Milk", "Sugar", "Cardamom"}, 5, 2);
        SweetDTO sweetDTO29 = new SweetDTO("Ghevar", 55, new String[]{"Maida", "Sugar", "Ghee", "Milk"}, 3, 1);
        SweetDTO sweetDTO30 = new SweetDTO("Basundi", 40, new String[]{"Milk", "Sugar", "Cardamom", "Saffron", "Dry fruits"}, 4, 1);

        set.add(sweetDTO1);
        set.add(sweetDTO2);
        set.add(sweetDTO3);
        set.add(sweetDTO4);
        set.add(sweetDTO5);
        set.add(sweetDTO6);
        set.add(sweetDTO7);
        set.add(sweetDTO8);
        set.add(sweetDTO9);
        set.add(sweetDTO10);
        set.add(sweetDTO11);
        set.add(sweetDTO12);
        set.add(sweetDTO13);
        set.add(sweetDTO14);
        set.add(sweetDTO15);
        set.add(sweetDTO16);
        set.add(sweetDTO17);
        set.add(sweetDTO18);
        set.add(sweetDTO19);
        set.add(sweetDTO20);
        set.add(sweetDTO21);
        set.add(sweetDTO22);
        set.add(sweetDTO23);
        set.add(sweetDTO24);
        set.add(sweetDTO25);
        set.add(sweetDTO26);
        set.add(sweetDTO27);
        set.add(sweetDTO28);
        set.add(sweetDTO29);
        set.add(sweetDTO30);


        System.out.println("sort by price in desc using treeSet");
        Set<SweetDTO> treeSweetDto=new TreeSet<>(set);
        treeSweetDto.stream().sorted(Comparator.comparing(SweetDTO::getPrice).reversed()).forEach(System.out::println);

        System.out.println("==================================================");
        System.out.println("Sort by name and price in desc");
        treeSweetDto.stream().sorted(Comparator.comparing(SweetDTO::getName).reversed().thenComparing(SweetDTO::getPrice).reversed()).forEach(System.out::println);

        System.out.println("================================================");
        System.out.println("Convert set into LinkedList");
        List<SweetDTO> list=new LinkedList<>(set);
        System.out.println("set converted into LinkedList size: "+list.size());
    }
}
