package com.xworkz.jerry.repository;

import com.xworkz.jerry.dto.ApplianceDto;

import java.util.Collection;

public interface ApplianceRepository {
    Collection<ApplianceDto> findAll();

}
