package com.xworkz.furniture.repository;

import com.xworkz.furniture.dto.FurnitureDto;

public interface FurnitureRepository {
    boolean persist(FurnitureDto furnitureDto);
}
