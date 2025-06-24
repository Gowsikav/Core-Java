package com.xworkz.jerry.repository;

import com.xworkz.jerry.dto.CampingAccessoryDto;

import java.util.Collection;

public interface CampingAccessorRepository {
    Collection<CampingAccessoryDto> findAll();
}
