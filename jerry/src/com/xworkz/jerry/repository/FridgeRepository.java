package com.xworkz.jerry.repository;

import com.xworkz.jerry.dto.FridgeDTO;

import java.util.Collection;

public interface FridgeRepository {

    Collection<FridgeDTO> findAll();
}
