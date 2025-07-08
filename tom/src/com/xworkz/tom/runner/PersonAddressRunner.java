package com.xworkz.tom.runner;

import com.xworkz.tom.dto.AddressDto;
import com.xworkz.tom.dto.PersonDto;

import java.util.HashMap;
import java.util.Map;

public class PersonAddressRunner {
    public static void main(String[] args) {

        Map<PersonDto, AddressDto> map = new HashMap<>();

        PersonDto personDto1 = new PersonDto("Akash", "akash82@gmail.com", "6239 8923 9264");
        PersonDto personDto2 = new PersonDto("Rahul", "rahul90@gmail.com", "9123 4567 8910");
        PersonDto personDto3 = new PersonDto("Sneha", "sneha.k@outlook.com", "7890 1234 5678");
        PersonDto personDto4 = new PersonDto("Priya", "priya88@yahoo.com", "8765 4321 1098");
        PersonDto personDto5 = new PersonDto("Vikram", "vikram34@gmail.com", "6789 0123 4567");
        PersonDto personDto6 = new PersonDto("Rohit", "rohit.kumar@gmail.com", "9012 3456 7890");
        PersonDto personDto7 = new PersonDto("Divya", "divya12@gmail.com", "2345 6789 0123");
        PersonDto personDto8 = new PersonDto("Meena", "meena.r@gmail.com", "3456 7890 1234");
        PersonDto personDto9 = new PersonDto("Anil", "anil78@hotmail.com", "4567 8901 2345");
        PersonDto personDto10 = new PersonDto("Sunita", "sunita.c@yahoo.com", "5678 9012 3456");
        PersonDto personDto11 = new PersonDto("Karan", "karan.singh@gmail.com", "6789 1234 5678");
        PersonDto personDto12 = new PersonDto("Ravi", "ravi_t@gmail.com", "7890 2345 6789");
        PersonDto personDto13 = new PersonDto("Neha", "neha89@gmail.com", "8901 3456 7890");
        PersonDto personDto14 = new PersonDto("Amit", "amit.mishra@yahoo.com", "9012 4567 8901");
        PersonDto personDto15 = new PersonDto("Pooja", "pooja.k@rediffmail.com", "1234 5678 9012");
        PersonDto personDto16 = new PersonDto("Suresh", "suresh_raj@gmail.com", "2345 6789 0123");
        PersonDto personDto17 = new PersonDto("Alok", "alok.verma@gmail.com", "3456 7890 1234");
        PersonDto personDto18 = new PersonDto("Kavita", "kavita.j@gmail.com", "4567 8901 2345");
        PersonDto personDto19 = new PersonDto("Deepak", "deepak99@yahoo.com", "5678 9012 3456");
        PersonDto personDto20 = new PersonDto("Lata", "lata.m@hotmail.com", "6789 0123 4567");
        PersonDto personDto21 = new PersonDto("Ajay", "ajay.k@gmail.com", "7890 1234 5678");
        PersonDto personDto22 = new PersonDto("Nisha", "nisha.b@gmail.com", "8901 2345 6789");
        PersonDto personDto23 = new PersonDto("Manoj", "manoj.t@gmail.com", "9012 3456 7890");
        PersonDto personDto24 = new PersonDto("Seema", "seema.singh@gmail.com", "1234 5678 9012");
        PersonDto personDto25 = new PersonDto("Tanya", "tanya.k@outlook.com", "2345 6789 0123");

        AddressDto addressDto1 = new AddressDto(89, "Kattuputhur", "Trichy", 621207);
        AddressDto addressDto2 = new AddressDto(45, "Gandhi Nagar", "Chennai", 600020);
        AddressDto addressDto3 = new AddressDto(12, "MG Road", "Bangalore", 560001);
        AddressDto addressDto4 = new AddressDto(78, "Vasant Vihar", "Delhi", 110057);
        AddressDto addressDto5 = new AddressDto(33, "Civil Lines", "Allahabad", 211001);
        AddressDto addressDto6 = new AddressDto(101, "Lakshmi Nagar", "Pune", 411030);
        AddressDto addressDto7 = new AddressDto(56, "Kothrud", "Pune", 411038);
        AddressDto addressDto8 = new AddressDto(98, "T Nagar", "Chennai", 600017);
        AddressDto addressDto9 = new AddressDto(63, "Salt Lake", "Kolkata", 700064);
        AddressDto addressDto10 = new AddressDto(24, "Dilsukhnagar", "Hyderabad", 500060);
        AddressDto addressDto11 = new AddressDto(39, "Jayanagar", "Bangalore", 560041);
        AddressDto addressDto12 = new AddressDto(85, "Annanagar", "Chennai", 600040);
        AddressDto addressDto13 = new AddressDto(77, "Rajaji Nagar", "Bangalore", 560010);
        AddressDto addressDto14 = new AddressDto(20, "Sector 15", "Noida", 201301);
        AddressDto addressDto15 = new AddressDto(61, "BTM Layout", "Bangalore", 560076);
        AddressDto addressDto16 = new AddressDto(90, "Perambur", "Chennai", 600011);
        AddressDto addressDto17 = new AddressDto(47, "Lalpur", "Ranchi", 834001);
        AddressDto addressDto18 = new AddressDto(29, "Ashok Nagar", "Chennai", 600083);
        AddressDto addressDto19 = new AddressDto(14, "Model Town", "Delhi", 110009);
        AddressDto addressDto20 = new AddressDto(72, "Aliganj", "Lucknow", 226024);
        AddressDto addressDto21 = new AddressDto(36, "Boring Road", "Patna", 800001);
        AddressDto addressDto22 = new AddressDto(59, "Indira Nagar", "Lucknow", 226016);
        AddressDto addressDto23 = new AddressDto(10, "Koramangala", "Bangalore", 560034);
        AddressDto addressDto24 = new AddressDto(53, "Behala", "Kolkata", 700034);
        AddressDto addressDto25 = new AddressDto(66, "Saidapet", "Chennai", 600015);

        map.put(personDto1,addressDto1);
        map.put(personDto2,addressDto2);
        map.put(personDto3,addressDto3);
        map.put(personDto4,addressDto4);
        map.put(personDto5,addressDto5);
        map.put(personDto6,addressDto6);
        map.put(personDto7,addressDto7);
        map.put(personDto8,addressDto8);
        map.put(personDto9,addressDto9);
        map.put(personDto10,addressDto10);
        map.put(personDto11,addressDto11);
        map.put(personDto12,addressDto12);
        map.put(personDto13,addressDto13);
        map.put(personDto14,addressDto14);
        map.put(personDto15,addressDto15);
        map.put(personDto16,addressDto16);
        map.put(personDto17,addressDto17);
        map.put(personDto18,addressDto18);
        map.put(personDto19,addressDto19);
        map.put(personDto20,addressDto20);
        map.put(personDto21,addressDto21);
        map.put(personDto22,addressDto22);
        map.put(personDto23,addressDto23);
        map.put(personDto24,addressDto24);
        map.put(personDto25,addressDto25);

        map.keySet().forEach(e-> System.out.println("PersonDetails: "+e));
        map.values().forEach(e-> System.out.println("Address: "+e));


    }
}
