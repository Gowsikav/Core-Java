package com.xworkz.tom.runner;

import com.xworkz.tom.dto.UniversityDto;
import com.xworkz.tom.internal.StaffList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UniversityRunner {
    public static void main(String[] args) {

        Map<UniversityDto,Map<String,String>> mapHashMap=new HashMap<>();

        UniversityDto universityDto1 = new UniversityDto("IIT Madras", "Chennai", 1959, 1);
        UniversityDto universityDto2 = new UniversityDto("Anna University", "Chennai", 1978, 2);
        UniversityDto universityDto3 = new UniversityDto("Madras University", "Chennai", 1857, 3);
        UniversityDto universityDto4 = new UniversityDto("NIT Trichy", "Tiruchirappalli", 1964, 4);
        UniversityDto universityDto5 = new UniversityDto("SRM Institute of Science and Technology", "Chennai", 1985, 5);
        UniversityDto universityDto6 = new UniversityDto("VIT", "Vellore", 1984, 6);
        UniversityDto universityDto7 = new UniversityDto("SASTRA University", "Thanjavur", 1984, 7);
        UniversityDto universityDto8 = new UniversityDto("Bharathiar University", "Coimbatore", 1982, 8);
        UniversityDto universityDto9 = new UniversityDto("Bharathidasan University", "Tiruchirappalli", 1982, 9);
        UniversityDto universityDto10 = new UniversityDto("Alagappa University", "Karaikudi", 1985, 10);
        UniversityDto universityDto11 = new UniversityDto("Periyar University", "Salem", 1997, 11);
        UniversityDto universityDto12 = new UniversityDto("Annamalai University", "Chidambaram", 1929, 12);
        UniversityDto universityDto13 = new UniversityDto("Manonmaniam Sundaranar University", "Tirunelveli", 1990, 13);
        UniversityDto universityDto14 = new UniversityDto("Tamil Nadu Agricultural University", "Coimbatore", 1971, 14);
        UniversityDto universityDto15 = new UniversityDto("Tamil University", "Thanjavur", 1981, 15);
        UniversityDto universityDto16 = new UniversityDto("Saveetha University", "Chennai", 2005, 16);
        UniversityDto universityDto17 = new UniversityDto("Hindustan University", "Chennai", 1985, 17);
        UniversityDto universityDto18 = new UniversityDto("Amrita Vishwa Vidyapeetham", "Coimbatore", 2003, 18);
        UniversityDto universityDto19 = new UniversityDto("Karunya University", "Coimbatore", 1986, 19);
        UniversityDto universityDto20 = new UniversityDto("Vel Tech University", "Avadi", 1997, 20);
        UniversityDto universityDto21 = new UniversityDto("Chennai Mathematical Institute", "Chennai", 1989, 21);
        UniversityDto universityDto22 = new UniversityDto("Indian Maritime University", "Chennai", 2008, 22);
        UniversityDto universityDto23 = new UniversityDto("University of Madras", "Chennai", 1857, 23);
        UniversityDto universityDto24 = new UniversityDto("Central University of Tamil Nadu", "Thiruvarur", 2009, 24);
        UniversityDto universityDto25 = new UniversityDto("Indian Institute of Information Technology", "Srirangam", 2013, 25);

        StaffList staffList=new StaffList();
        List<Map<String,String>> mapList=staffList.mapList();

        mapHashMap.put(universityDto1,mapList.get(0));
        mapHashMap.put(universityDto2,mapList.get(1));
        mapHashMap.put(universityDto3,mapList.get(2));
        mapHashMap.put(universityDto4,mapList.get(3));
        mapHashMap.put(universityDto5,mapList.get(4));
        mapHashMap.put(universityDto6,mapList.get(5));
        mapHashMap.put(universityDto7,mapList.get(6));
        mapHashMap.put(universityDto8,mapList.get(7));
        mapHashMap.put(universityDto9,mapList.get(8));
        mapHashMap.put(universityDto10,mapList.get(9));
        mapHashMap.put(universityDto11,mapList.get(10));
        mapHashMap.put(universityDto12,mapList.get(11));
        mapHashMap.put(universityDto13,mapList.get(12));
        mapHashMap.put(universityDto14,mapList.get(13));
        mapHashMap.put(universityDto15,mapList.get(14));
        mapHashMap.put(universityDto16,mapList.get(15));
        mapHashMap.put(universityDto17,mapList.get(16));
        mapHashMap.put(universityDto18,mapList.get(17));
        mapHashMap.put(universityDto19,mapList.get(18));
        mapHashMap.put(universityDto20,mapList.get(19));
        mapHashMap.put(universityDto21,mapList.get(20));
        mapHashMap.put(universityDto22,mapList.get(21));
        mapHashMap.put(universityDto23,mapList.get(22));
        mapHashMap.put(universityDto24,mapList.get(23));
        mapHashMap.put(universityDto25,mapList.get(24));

        System.out.println("Keys");
        mapHashMap.keySet().forEach(System.out::println);
        System.out.println("Values");
        mapHashMap.values().forEach(System.out::println);

        System.out.println("Entries");
        Set<Map.Entry<UniversityDto,Map<String,String>>> entrySet=mapHashMap.entrySet();
        entrySet.forEach(e->{
            UniversityDto universityDto=e.getKey();
            Map<String,String> map=e.getValue();
            System.out.println(universityDto);
            System.out.println(map);
        });
    }
}
