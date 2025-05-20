package com.xworkz.furniture.service;

import com.xworkz.furniture.dto.FurnitureDto;

public class FurnitureServiceImpl implements FurnitureService {
    public FurnitureServiceImpl()
    {
        System.out.println("Furniture service implementation constructor");
    }

    @Override
    public boolean save(FurnitureDto furnitureDto) {
        System.out.println("Save method in furniture service implementation class");
        if(furnitureDto !=null)
        {
            System.out.println("furnitureDto is not null");
        }
        else {
            System.err.println("FurnitureDto is null");
            return false;
        }
        String brand=furnitureDto.getBrand();
        if(brand!=null && brand.length()>=3 && brand.length()<=20)
        {
            System.out.println("Valid brand");
        }
        else {
            System.err.println("Invalid brand");
            return false;
        }
        String size=furnitureDto.getSize();
        if(size!=null && !size.isEmpty())
        {
            System.out.println("Valid size");
        }
        else {
            System.err.println("Invalid size");
            return false;
        }
        String material=furnitureDto.getMaterial();
        if(material!=null && material.length()>=3 && material.length()<=15)
        {
            System.out.println("Valid material");
        }
        else
        {
            System.err.println("Invalid material");
            return false;
        }
        String modelName=furnitureDto.getModelName();
        if(modelName!=null && modelName.length()>=3 && modelName.length()<=25)
        {
            System.out.println("Valid modelName");
        }
        else
        {
            System.err.println("Invalid modelName");
            return false;
        }
        String productBenefits=furnitureDto.getProductBenefits();
        if(productBenefits!=null && productBenefits.length()>=3 && productBenefits.length()<=100)
        {
            System.out.println("Valid product benefits");
        }
        else
        {
            System.err.println("Invalid product benefits");
            return false;
        }
        return true;
    }
}
