package com.xworkz.furniture.repository;

import com.xworkz.furniture.dto.FurnitureDto;

public class FurnitureRepositoryImpl implements FurnitureRepository{
    public FurnitureRepositoryImpl() {
        System.out.println("Furniture Repository Implementation Constructor");
    }

    @Override
    public boolean persist(FurnitureDto furnitureDto) {
        System.out.println("persist method in Furniture Repository Implementation");
        return true;
    }
}
