package com.xworkz.laptop.service;

import com.xworkz.laptop.dto.LaptopDto;

import java.util.Optional;

public interface LaptopService {
    boolean save(LaptopDto laptopDto);

    default Optional<LaptopDto> findById(int laptopId){
        return Optional.empty();
    }

    LaptopDto[] findAll();
}
