package com.xworkz.jerry.runner;

import com.xworkz.jerry.dto.CampingAccessoryDto;

import java.util.ArrayList;
import java.util.Collection;

public class CampingAccessoryRunner {
    public static void main(String[] args) {

        CampingAccessoryDto campingAccessoryDto1=new CampingAccessoryDto("Tent", 2.5, true, "Shelter", true);
        CampingAccessoryDto campingAccessoryDto2=new CampingAccessoryDto("Sleeping Bag", 1.8, false, "Sleeping Gear", true);
        CampingAccessoryDto campingAccessoryDto3=new CampingAccessoryDto("Portable Stove", 1.2, false, "Cooking", true);
        CampingAccessoryDto campingAccessoryDto4=new CampingAccessoryDto("Lantern", 0.8, false, "Lighting", true);
        CampingAccessoryDto campingAccessoryDto5=new CampingAccessoryDto("Backpack", 1.0, true, "Storage", true);
        CampingAccessoryDto campingAccessoryDto6=new CampingAccessoryDto("Rain Jacket", 0.6, true, "Clothing", true);
        CampingAccessoryDto campingAccessoryDto7=new CampingAccessoryDto("First Aid Kit", 0.4, false, "Safety", true);
        CampingAccessoryDto campingAccessoryDto8=new CampingAccessoryDto("Water Bottle", 0.5, true, "Hydration", true);
        CampingAccessoryDto campingAccessoryDto9=new CampingAccessoryDto("Multi-tool", 0.3, false, "Utility", true);
        CampingAccessoryDto campingAccessoryDto10=new CampingAccessoryDto("Camp Chair", 2.0, false, "Furniture", true);

        Collection<CampingAccessoryDto> collection=new ArrayList<>();
        collection.add(campingAccessoryDto1);
        collection.add(campingAccessoryDto2);
        collection.add(campingAccessoryDto3);
        collection.add(campingAccessoryDto4);
        collection.add(campingAccessoryDto5);
        collection.add(campingAccessoryDto6);
        collection.add(campingAccessoryDto7);
        collection.add(campingAccessoryDto8);
        collection.add(campingAccessoryDto9);
        collection.add(campingAccessoryDto10);

        for(CampingAccessoryDto campingAccessoryDto:collection)
        {
            System.out.println("Camping Accessory Name: "+campingAccessoryDto.getAccessoryName());
            System.out.println("Weight: "+campingAccessoryDto.getWeight()+"kg");
            System.out.println("WaterProof: "+campingAccessoryDto.isWaterProof());
            System.out.println("Category: "+campingAccessoryDto.getCategory());
            System.out.println("Protable: "+campingAccessoryDto.isPortable());
            System.out.println("========================================");
        }
    }
}
