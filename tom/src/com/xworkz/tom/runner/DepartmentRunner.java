package com.xworkz.tom.runner;

import com.xworkz.tom.dto.DepartmentDto;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DepartmentRunner {
    public static void main(String[] args) {

        DepartmentDto departmentDto1 = new DepartmentDto(301, "New York");
        DepartmentDto departmentDto2 = new DepartmentDto(302, "San Francisco");
        DepartmentDto departmentDto3 = new DepartmentDto(303, "Los Angeles");
        DepartmentDto departmentDto4 = new DepartmentDto(304, "Chicago");
        DepartmentDto departmentDto5 = new DepartmentDto(305, "Houston");
        DepartmentDto departmentDto6 = new DepartmentDto(306, "Seattle");
        DepartmentDto departmentDto7 = new DepartmentDto(307, "Austin");
        DepartmentDto departmentDto8 = new DepartmentDto(308, "Boston");
        DepartmentDto departmentDto9 = new DepartmentDto(309, "Atlanta");
        DepartmentDto departmentDto10 = new DepartmentDto(310, "Denver");
        DepartmentDto departmentDto11 = new DepartmentDto(311, "Phoenix");
        DepartmentDto departmentDto12 = new DepartmentDto(312, "Philadelphia");
        DepartmentDto departmentDto13 = new DepartmentDto(313, "San Diego");
        DepartmentDto departmentDto14 = new DepartmentDto(314, "Dallas");
        DepartmentDto departmentDto15 = new DepartmentDto(315, "Miami");
        DepartmentDto departmentDto16 = new DepartmentDto(316, "Orlando");
        DepartmentDto departmentDto17 = new DepartmentDto(317, "Las Vegas");
        DepartmentDto departmentDto18 = new DepartmentDto(318, "Minneapolis");
        DepartmentDto departmentDto19 = new DepartmentDto(319, "Charlotte");
        DepartmentDto departmentDto20 = new DepartmentDto(320, "Detroit");
        DepartmentDto departmentDto21 = new DepartmentDto(321, "Portland");
        DepartmentDto departmentDto22 = new DepartmentDto(322, "Tampa");
        DepartmentDto departmentDto23 = new DepartmentDto(323, "Cleveland");
        DepartmentDto departmentDto24 = new DepartmentDto(324, "Baltimore");
        DepartmentDto departmentDto25 = new DepartmentDto(325, "Salt Lake City");

        Map<DepartmentDto, List<String>> listMap=new HashMap<>();

        listMap.put(departmentDto1, Arrays.asList("Arun", "Bala", "Chitra"));
        listMap.put(departmentDto2, Arrays.asList("Dinesh", "Ezhil", "Farook"));
        listMap.put(departmentDto3, Arrays.asList("Gokul", "Harini", "Ilamaran"));
        listMap.put(departmentDto4, Arrays.asList("Jaya", "Karthik", "Lavanya"));
        listMap.put(departmentDto5, Arrays.asList("Mani", "Nalini", "prakash"));
        listMap.put(departmentDto6, Arrays.asList("Prakash", "Quila", "Revathi"));
        listMap.put(departmentDto7, Arrays.asList("Saravanan", "Tharani", "Uma"));
        listMap.put(departmentDto8, Arrays.asList("Vignesh", "Yamini", "Zareena"));
        listMap.put(departmentDto9, Arrays.asList("Akilan", "Bhavani", "Chandru"));
        listMap.put(departmentDto10, Arrays.asList("Devi", "Elango", "Fathima"));
        listMap.put(departmentDto11, Arrays.asList("Ganesh", "Hemalatha", "Indhu"));
        listMap.put(departmentDto12, Arrays.asList("Jagan", "Kalaivani", "Loganathan"));
        listMap.put(departmentDto13, Arrays.asList("Meena", "Naveen", "Oviya"));
        listMap.put(departmentDto14, Arrays.asList("Pavithra", "Quinson", "Rajesh"));
        listMap.put(departmentDto15, Arrays.asList("Sundar", "Tamilselvi", "Uthra"));
        listMap.put(departmentDto16, Arrays.asList("Vetri", "Yogesh", "Zubaida"));
        listMap.put(departmentDto17, Arrays.asList("Anbu", "Bagya", "Chella"));
        listMap.put(departmentDto18, Arrays.asList("Dhanya", "Eashwar", "Firoz"));
        listMap.put(departmentDto19, Arrays.asList("Ganga", "Hari", "Ishwarya"));
        listMap.put(departmentDto20, Arrays.asList("Jothi", "Kavin", "Leela"));
        listMap.put(departmentDto21, Arrays.asList("Mohan", "Nandhini", "Ovi"));
        listMap.put(departmentDto22, Arrays.asList("Pranav", "Quira", "Rani"));
        listMap.put(departmentDto23, Arrays.asList("Siva", "Thenmozhi", "Ulaganathan"));
        listMap.put(departmentDto24, Arrays.asList("Valli", "Yashwanth", "Zahir"));
        listMap.put(departmentDto25, Arrays.asList("Arjunan", "Bharathi", "Chinnappa"));

        System.out.println("Keys");
        listMap.keySet().forEach(System.out::println);
        System.out.println("Values");
        listMap.values().forEach(System.out::println);
    }
}
