package com.xworkz.furniture.dto;

import com.xworkz.furniture.service.FurnitureService;

public class FurnitureServiceImpl implements FurnitureService {
    public FurnitureServiceImpl()
    {
        System.out.println("Furniture service implementation constructor");
    }

    @Override
    public boolean save(FurnitureDto furnitureDto) {
        System.out.println("Save method in furniture service implementation class");
        return true;
    }
}
