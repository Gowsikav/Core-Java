package com.xworkz.jerry.runner;

import com.xworkz.jerry.dto.FanDto;
import com.xworkz.jerry.repository.FanRepository;
import com.xworkz.jerry.repository.FanRepositoryImpl;

import java.util.Collection;
import java.util.Iterator;

public class FanRunner {
    public static void main(String[] args) {
        FanRepository fanRepository=new FanRepositoryImpl();
        Collection<FanDto> fanDtoCollection= fanRepository.findAll();

        System.out.println("Fan brand list which size less is 47: ");
        for(FanDto fanDto: fanDtoCollection)
        {
            if(fanDto.getSize()==47)
            {
                System.out.println("Brand: "+fanDto.getBrand());
            }
        }
        System.out.println("==================================");
        Iterator<FanDto> iterator=fanDtoCollection.iterator();
        while(iterator.hasNext())
        {
            FanDto fanDto=iterator.next();
            System.out.println("Brand: "+fanDto.getBrand());
            System.out.println("No of Blades: "+fanDto.getNoOfBlades());
            System.out.println("Colour: "+fanDto.getColor());
            System.out.println("Price: "+fanDto.getPrice());
            System.out.println("Size: "+fanDto.getSize());
            System.out.println("===============================");
        }
    }
}
