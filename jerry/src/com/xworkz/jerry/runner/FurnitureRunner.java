package com.xworkz.jerry.runner;

import com.xworkz.jerry.dto.FurnitureDto;
import com.xworkz.jerry.repository.FurnitureRepository;
import com.xworkz.jerry.repository.FurnitureRepositoryImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class FurnitureRunner {
    public static void main(String[] args) {

        FurnitureRepository furnitureRepository=new FurnitureRepositoryImpl();
        Collection<FurnitureDto> collection=furnitureRepository.findAll();

        System.out.println("Furniture brand list which are all round shape:");
        for(FurnitureDto furnitureDto:collection)
        {
            System.out.println("Furniture Brand: "+furnitureDto.getBrand());
            System.out.println("Material: "+furnitureDto.getMaterial());
            System.out.println("Price: "+furnitureDto.getPrice());
            System.out.println("Colour: "+furnitureDto.getColor());
            System.out.println("Shape: "+furnitureDto.getShape());
            System.out.println("================================");
        }

        System.out.println("Collection size: "+collection.size());

        Iterator<FurnitureDto> iterator=collection.iterator();
        while(iterator.hasNext())
        {
            FurnitureDto furnitureDto=iterator.next();

            if(furnitureDto.getShape().equalsIgnoreCase("round")) {
                iterator.remove();
                System.out.println("Removed Dto: "+furnitureDto);
            }
        }
        System.out.println("After remove size: "+collection.size());

        FurnitureDto furniture=new FurnitureDto("Pepperfry", "Plastic", 2000, "Square", "red");
        System.out.println("Contains "+furniture+": "+collection.contains(furniture));

        Collection<FurnitureDto> extraList=new ArrayList<>();
        FurnitureDto furnitureDto1=new FurnitureDto("Godrej Interio", "Copper", 6500, "Square", "White");
        FurnitureDto furnitureDto2= new FurnitureDto("Featherlite", "Wood", 7000, "Rectangle", "Cherry");
        extraList.add(furnitureDto1);
        extraList.add(furnitureDto2);

        System.out.println("Added addAll extraList : "+collection.addAll(extraList));
        System.out.println("Size: "+collection.size());

        System.out.println("ContainsAll extraList: "+collection.containsAll(extraList));

        System.out.println("RemoveAll Extralist in collection: "+collection.removeAll(extraList));

        System.out.println("Size: "+collection.size());
        System.out.println("Is Empty: "+collection.isEmpty());


    }
}
