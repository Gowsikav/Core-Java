package com.xworkz.jerry.repository;

import com.xworkz.jerry.dto.FurnitureDto;

import java.util.ArrayList;
import java.util.Collection;

public class FurnitureRepositoryImpl implements FurnitureRepository {
    public FurnitureRepositoryImpl()
    {
        System.out.println("FurnitureRepository Implementation constructor");
    }

    @Override
    public Collection<FurnitureDto> findAll() {

        System.out.println("findAll method in FurnitureRepository Implementation");

        FurnitureDto furnitureDto1=new FurnitureDto("IKEA", "Wood", 5000, "Rectangle", "Brown");
        FurnitureDto furnitureDto2=new FurnitureDto("Urban Ladder", "Metal", 8500, "Round", "Black");
        FurnitureDto furnitureDto3=new FurnitureDto("Pepperfry", "Plastic", 2000, "Square", "White");
        FurnitureDto furnitureDto4=new FurnitureDto("HomeTown", "Wood", 7400, "Oval", "Natural");
        FurnitureDto furnitureDto5=new FurnitureDto("Durian", "Leather", 15000, "Rectangle", "Beige");
        FurnitureDto furnitureDto6=new FurnitureDto("Nilkamal", "Plastic", 1500, "Round", "Blue");
        FurnitureDto furnitureDto7=new FurnitureDto("Godrej Interio", "Metal", 6500, "Square", "Gray");
        FurnitureDto furnitureDto8=new FurnitureDto("Featherlite", "Wood", 9000, "Rectangle", "Cherry");
        FurnitureDto furnitureDto9=new FurnitureDto("Zuari", "Glass", 8000, "Oval", "Transparent");
        FurnitureDto furnitureDto10=new FurnitureDto("Damro", "Fabric", 7900, "L-shape", "Maroon");

        Collection<FurnitureDto> collection=new ArrayList<>();
        collection.add(furnitureDto1);
        collection.add(furnitureDto2);
        collection.add(furnitureDto3);
        collection.add(furnitureDto4);
        collection.add(furnitureDto5);
        collection.add(furnitureDto6);
        collection.add(furnitureDto7);
        collection.add(furnitureDto8);
        collection.add(furnitureDto9);
        collection.add(furnitureDto10);

        return collection;
    }
}
