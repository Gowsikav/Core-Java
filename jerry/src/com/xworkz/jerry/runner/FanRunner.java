package com.xworkz.jerry.runner;

import com.xworkz.jerry.dto.FanDto;
import com.xworkz.jerry.repository.FanRepository;
import com.xworkz.jerry.repository.FanRepositoryImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class FanRunner {
    public static void main(String[] args) {
        FanRepository fanRepository=new FanRepositoryImpl();
        Collection<FanDto> fanDtoCollection= fanRepository.findAll();

        for(FanDto fanDto: fanDtoCollection)
        {
            System.out.println("Brand: "+fanDto.getBrand());
            System.out.println("No of Blades: "+fanDto.getNoOfBlades());
            System.out.println("Colour: "+fanDto.getColor());
            System.out.println("Price: "+fanDto.getPrice());
            System.out.println("Size: "+fanDto.getSize());
            System.out.println("===============================");

        }
        System.out.println("Size: "+fanDtoCollection.size());
        Iterator<FanDto> iterator=fanDtoCollection.iterator();
        while(iterator.hasNext())
        {
            FanDto fanDto=iterator.next();
            if(fanDto.getSize()==47)
            {
                iterator.remove();
                System.out.println("Removed Dto: "+fanDto);
            }
        }

        System.out.println("After remove size: "+fanDtoCollection.size());

        FanDto testFan = new FanDto("BPL", 7, 1000, 47, "Blue");
        boolean containsFan = fanDtoCollection.contains(testFan);
        System.out.println("Contains "+testFan+": " + containsFan);

        Collection<FanDto> testList = new ArrayList<>();
        FanDto fanDto1=new FanDto("BPL",3,1000,47,"Blue");
        FanDto fanDto2=new FanDto("MARC Bonita",3,1500,47,"Violet");
        testList.add(fanDto1);
        testList.add(fanDto2);

        System.out.println("Added new fans: "+fanDtoCollection.addAll(testList));

        System.out.println("After addAll size: " + fanDtoCollection.size());

        System.out.println("Contains all test fans: " + fanDtoCollection.containsAll(testList));

        System.out.println("Removed all test fans: "+fanDtoCollection.removeAll(testList));
        System.out.println("After removedAll size: "+fanDtoCollection.size());
        System.out.println("Is collection empty: "+fanDtoCollection.isEmpty());
    }
}
