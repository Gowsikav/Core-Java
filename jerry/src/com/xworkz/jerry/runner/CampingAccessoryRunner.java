package com.xworkz.jerry.runner;

import com.xworkz.jerry.dto.CampingAccessoryDto;
import com.xworkz.jerry.repository.CampingAccessorRepository;
import com.xworkz.jerry.repository.CampingAccessorRepositoryImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CampingAccessoryRunner {
    public static void main(String[] args) {

        CampingAccessorRepository campingAccessorRepository=new CampingAccessorRepositoryImpl();
        Collection<CampingAccessoryDto> collection=campingAccessorRepository.findAll();

        for(CampingAccessoryDto campingAccessoryDto:collection)
        {
            System.out.println("Camping Accessory Name: "+campingAccessoryDto.getAccessoryName());
            System.out.println("Weight: "+campingAccessoryDto.getWeight()+"kg");
            System.out.println("WaterProof: "+campingAccessoryDto.isWaterProof());
            System.out.println("Category: "+campingAccessoryDto.getCategory());
            System.out.println("Portable: "+campingAccessoryDto.isPortable());
            System.out.println("========================================");

        }

        System.out.println("Collection size: "+collection.size());
        Iterator<CampingAccessoryDto> iterator= collection.iterator();
        while (iterator.hasNext())
        {
            CampingAccessoryDto campingAccessoryDto=iterator.next();
            if(campingAccessoryDto.getWeight()<1) {
               iterator.remove();
                System.out.println("Removed Dto: "+campingAccessoryDto);
            }
        }
        System.out.println("Collection size after removal: " + collection.size());


        CampingAccessoryDto camping = new CampingAccessoryDto("Tent", 2.5, true, "Shelter", true);
        System.out.println("Contains "+camping+": " + collection.contains(camping));

        Collection<CampingAccessoryDto> extraList = new ArrayList<>();
        CampingAccessoryDto camping1=new CampingAccessoryDto("Rain Jacket", 0.6, true, "Clothing", true);
        CampingAccessoryDto camping2=new CampingAccessoryDto("First Aid Kit", 0.4, false, "Safety", true);
        extraList.add(camping1);
        extraList.add(camping2);

        System.out.println("Added extraList: "+collection.addAll(extraList));
        System.out.println("Collection size after addedAll: " + collection.size());
        System.out.println("Contains all test items? " + collection.containsAll(extraList));
        System.out.println("Remove all extraList: "+collection.removeAll(extraList));
        System.out.println("After remove extraList collection size: "+collection.size());
        System.out.println("Is collection empty: " + collection.isEmpty());
    }
}
