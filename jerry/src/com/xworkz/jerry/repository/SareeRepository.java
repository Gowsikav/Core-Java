package com.xworkz.jerry.repository;

import com.xworkz.jerry.dto.SareeDto;

import java.util.Collection;

public interface SareeRepository {
    Collection<SareeDto> findAll();
}
