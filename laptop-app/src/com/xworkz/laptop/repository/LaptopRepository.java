package com.xworkz.laptop.repository;

import com.xworkz.laptop.dto.LaptopDto;

public interface LaptopRepository {
    boolean persist(LaptopDto laptopDto);
}
