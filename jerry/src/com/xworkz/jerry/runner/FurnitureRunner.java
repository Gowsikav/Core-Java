package com.xworkz.jerry.runner;

import com.xworkz.jerry.dto.FurnitureDto;
import com.xworkz.jerry.repository.FurnitureRepository;
import com.xworkz.jerry.repository.FurnitureRepositoryImpl;

import java.util.Collection;
import java.util.Iterator;

public class FurnitureRunner {
    public static void main(String[] args) {

        FurnitureRepository furnitureRepository=new FurnitureRepositoryImpl();
        Collection<FurnitureDto> collection=furnitureRepository.findAll();

        System.out.println("Furniture brand list which are all round shape:");
        for(FurnitureDto furnitureDto:collection)
        {
            if(furnitureDto.getShape().equalsIgnoreCase("round")) {
                System.out.println("Furniture Brand: " + furnitureDto.getBrand());
            }
        }

        System.out.println("================================");

        Iterator<FurnitureDto> iterator=collection.iterator();
        while(iterator.hasNext())
        {
            FurnitureDto furnitureDto=iterator.next();
            System.out.println("Furniture Brand: "+furnitureDto.getBrand());
            System.out.println("Material: "+furnitureDto.getMaterial());
            System.out.println("Price: "+furnitureDto.getPrice());
            System.out.println("Colour: "+furnitureDto.getColor());
            System.out.println("Shape: "+furnitureDto.getShape());
            System.out.println("================================");
        }
    }
}
