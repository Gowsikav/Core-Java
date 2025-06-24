package com.xworkz.jerry.runner;

import com.xworkz.jerry.dto.CampingAccessoryDto;
import com.xworkz.jerry.repository.CampingAccessorRepository;
import com.xworkz.jerry.repository.CampingAccessorRepositoryImpl;

import java.util.Collection;
import java.util.Iterator;

public class CampingAccessoryRunner {
    public static void main(String[] args) {

        CampingAccessorRepository campingAccessorRepository=new CampingAccessorRepositoryImpl();
        Collection<CampingAccessoryDto> collection=campingAccessorRepository.findAll();

        System.out.println("Camping Accessory weight less than 1 things list:");
        for(CampingAccessoryDto campingAccessoryDto:collection)
        {
            if(campingAccessoryDto.getWeight()<1) {
                System.out.println("Camping Accessory Name: " + campingAccessoryDto.getAccessoryName());

            }
        }

        System.out.println("========================================");

        Iterator<CampingAccessoryDto> iterator= collection.iterator();
        while (iterator.hasNext())
        {
            CampingAccessoryDto campingAccessoryDto=iterator.next();
            System.out.println("Camping Accessory Name: "+campingAccessoryDto.getAccessoryName());
            System.out.println("Weight: "+campingAccessoryDto.getWeight()+"kg");
            System.out.println("WaterProof: "+campingAccessoryDto.isWaterProof());
            System.out.println("Category: "+campingAccessoryDto.getCategory());
            System.out.println("Protable: "+campingAccessoryDto.isPortable());
            System.out.println("========================================");

        }
    }
}
