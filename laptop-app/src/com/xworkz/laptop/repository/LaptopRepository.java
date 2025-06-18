package com.xworkz.laptop.repository;

import com.xworkz.laptop.dto.LaptopDto;

import java.util.Optional;

public interface LaptopRepository {
    boolean persist(LaptopDto laptopDto);

    default Optional<LaptopDto> findById(int laptopId)
    {
        return Optional.empty();
    }

    LaptopDto[] findAll();
}
