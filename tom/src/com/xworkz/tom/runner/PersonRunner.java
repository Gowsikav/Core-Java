package com.xworkz.tom.runner;

import com.xworkz.tom.dto.PersonDto;

import java.util.HashMap;
import java.util.Map;

public class PersonRunner {

    public static void main(String[] args) {

        PersonDto personDto1 =new PersonDto("Ram","ram02@gmail.com","6239 8923 8329");
        PersonDto personDto2 =new PersonDto("Shalini","shalini729@gmail.com","6239 8792 8329");
        PersonDto personDto3 =new PersonDto("Akash","akash82@gmail.com","6239 8923 9264");
        PersonDto personDto4 =new PersonDto("Akash","akash82@gmail.com","6239 8923 9264");


        Map<PersonDto,String> map=new HashMap<>();

        map.put(personDto1,"Tamil Nadu");
        map.put(personDto2,"Karnataka");
        map.put(personDto3,"Kerala");
        map.put(personDto4,"Kerala");

        map.keySet().forEach(System.out::println);

        System.out.println("Values");
        map.values().forEach(System.out::println);
    }
}
