package com.xworkz.jerry.repository;

import com.xworkz.jerry.dto.FurnitureDto;

import java.util.Collection;

public interface FurnitureRepository {
    Collection<FurnitureDto> findAll();
}
