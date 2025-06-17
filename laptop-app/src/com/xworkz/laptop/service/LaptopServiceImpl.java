package com.xworkz.laptop.service;

import com.xworkz.laptop.dto.LaptopDto;
import com.xworkz.laptop.repository.LaptopRepository;
import com.xworkz.laptop.repository.LaptopRepositoryImpl;

import java.time.LocalDate;
import java.util.Optional;

public class LaptopServiceImpl implements LaptopService{

    public LaptopServiceImpl()
    {
        System.out.println("Laptop service Implementation constructor");
    }
    @Override
    public boolean save(LaptopDto laptopDto) {
        System.out.println("save method in Laptop service Implementation");

        if(laptopDto==null)
        {
            System.out.println("Laptop Dto is null");
            return false;
        }
        else {
            System.out.println("Laptop dto is not null");
        }
        String brand= laptopDto.getBrand();
        if(brand==null || brand.length()<2 || brand.length()>25)
        {
            System.out.println("Brand is invalid");
            return false;
        }
        else {
            System.out.println("Brand is valid");
        }
        String model= laptopDto.getModel();
        if(model==null || model.length()<3 || model.length()>25)
        {
            System.out.println("Model is invalid");
            return false;
        }
        else {
            System.out.println("Model is valid");
        }
        double price= laptopDto.getPrice();
        if(price<10000 || price>1000000)
        {
            System.out.println("Price is invalid");
            return false;
        }
        else {
            System.out.println("Price is valid");
        }

        System.out.println("IsAvailable is valid");

        String warranty= laptopDto.getWarranty();
        if(warranty==null || warranty.isEmpty())
        {
            System.out.println("Warranty is invalid");
            return false;
        }
        else {
            System.out.println("Warranty is valid");
        }
        LocalDate manufacturedDate=laptopDto.getManufacturedDate();
        if(manufacturedDate==null || manufacturedDate.isAfter(LocalDate.now()))
        {
            System.out.println("Manufactured Date is invalid");
            return false;
        }
        else {
            System.out.println("Manufactured Date is valid");
        }

        System.out.println("Validation Done All fields are correct");
        LaptopRepository laptopRepository=new LaptopRepositoryImpl();
        return laptopRepository.persist(laptopDto);
    }

    @Override
    public Optional<LaptopDto> findById(int laptopId) {
        System.out.println("findById method in laptop service implementation");
        if(laptopId>0)
        {
            System.out.println("laptopId is valid");

            LaptopRepository laptopRepository=new LaptopRepositoryImpl();
            return laptopRepository.findById(laptopId);
        }
        System.out.println("Laptop id is invalid");
        return Optional.empty();
    }
}
