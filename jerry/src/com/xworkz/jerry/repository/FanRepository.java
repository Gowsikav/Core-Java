package com.xworkz.jerry.repository;

import com.xworkz.jerry.dto.FanDto;

import java.util.Collection;

public interface FanRepository {

    Collection<FanDto> findAll();
}
