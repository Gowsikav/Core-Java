package com.xworkz.tom.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StaffList {
    public StaffList()
    {
        System.out.println("StaffList constructor");
    }

    public List<Map<String,String>> mapList()
    {
        System.out.println("mapList method in StaffList");

        List<Map<String,String>> list=new ArrayList<>();

        Map<String, String> map1 = new HashMap<>();
        map1.put("Computer Science", "Dr. Alan");
        map1.put("Physics", "Dr. Lisa");
        list.add(map1);

        Map<String, String> map2 = new HashMap<>();
        map2.put("Mathematics", "Dr. Ramesh");
        map2.put("Chemistry", "Dr. Meena");
        list.add(map2);

        Map<String, String> map3 = new HashMap<>();
        map3.put("Mechanical Engineering", "Dr. Aravind");
        map3.put("Electrical Engineering", "Dr. Suresh");
        list.add(map3);

        Map<String, String> map4 = new HashMap<>();
        map4.put("Civil Engineering", "Dr. Shalini");
        map4.put("Electronics and Communication", "Dr. Karthik");
        list.add(map4);

        Map<String, String> map5 = new HashMap<>();
        map5.put("Biotechnology", "Dr. Anitha");
        map5.put("Information Technology", "Dr. Manoj");
        list.add(map5);

        Map<String, String> map6 = new HashMap<>();
        map6.put("Architecture", "Dr. Priya");
        map6.put("Philosophy", "Dr. Vasanth");
        list.add(map6);

        Map<String, String> map7= new HashMap<>();
        map7.put("Economics", "Dr. Rekha");
        map7.put("Psychology", "Dr. Naveen");
        list.add(map7);

        Map<String, String> map8 = new HashMap<>();
        map8.put("History", "Dr. Raji");
        map8.put("Sociology", "Dr. Gopal");
        list.add(map8);

        Map<String, String> map9= new HashMap<>();
        map9.put("Political Science", "Dr. Hemalatha");
        map9.put("English", "Dr. Devi");
        list.add(map9);

        Map<String, String> map10= new HashMap<>();
        map10.put("Tamil", "Dr. Kumaran");
        map10.put("Management Studies", "Dr. Santhosh");
        list.add(map10);

        Map<String, String> map11= new HashMap<>();
        map11.put("Commerce", "Dr. Lavanya");
        map11.put("Zoology", "Dr. Jayaprakash");
        list.add(map11);

        Map<String, String> map12 = new HashMap<>();
        map12.put("Botany", "Dr. Indira");
        map12.put("Statistics", "Dr. Venkat");
        list.add(map12);

        Map<String, String> map13 = new HashMap<>();
        map13.put("Environmental Science", "Dr. Janani");
        map13.put("Data Science", "Dr. Balaji");
        list.add(map13);

        Map<String, String> map14 = new HashMap<>();
        map14.put("Artificial Intelligence", "Dr. Sneha");
        map14.put("Cybersecurity", "Dr. Arjun");
        list.add(map14);

        Map<String, String> map15 = new HashMap<>();
        map15.put("Cloud Computing", "Dr. Radha");
        map15.put("Robotics", "Dr. Vikram");
        list.add(map15);

        Map<String, String> map16 = new HashMap<>();
        map16.put("Automobile Engineering", "Dr. Nandhini");
        map16.put("Textile Technology", "Dr. Senthil");
        list.add(map16);

        Map<String, String> map17 = new HashMap<>();
        map17.put("Marine Engineering", "Dr. Poornima");
        map17.put("Aerospace Engineering", "Dr. Dileep");
        list.add(map17);

        Map<String, String> map18= new HashMap<>();
        map18.put("Food Technology", "Dr. Savitha");
        map18.put("Genetics", "Dr. Deepak");
        list.add(map18);

        Map<String, String> map19 = new HashMap<>();
        map19.put("Microbiology", "Dr. Harini");
        map19.put("Pharmacology", "Dr. Yuvraj");
        list.add(map19);

        Map<String, String> map20 = new HashMap<>();
        map20.put("Fine Arts", "Dr. Tharani");
        map20.put("Performing Arts", "Dr. Keshav");
        list.add(map20);

        Map<String, String> map21 = new HashMap<>();
        map21.put("Linguistics", "Dr. Revathi");
        map21.put("Library Science", "Dr. Kumaravel");
        list.add(map21);

        Map<String, String> map22 = new HashMap<>();
        map22.put("Public Administration", "Dr. Anbarasu");
        map22.put("Mass Communication", "Dr. Sridevi");
        list.add(map22);

        Map<String, String> map23= new HashMap<>();
        map23.put("Geology", "Dr. Arunachalam");
        map23.put("Remote Sensing", "Dr. Mithra");
        list.add(map23);

        Map<String, String> map24 = new HashMap<>();
        map24.put("Astronomy", "Dr. Mahalingam");
        map24.put("Education", "Dr. Geetha");
        list.add(map24);

        Map<String, String> map25 = new HashMap<>();
        map25.put("Criminology", "Dr. Rathan");
        map25.put("Social Work", "Dr. Parvathi");
        list.add(map25);

        return list;
    }
}
