package com.xworkz.tom.repository;

import com.xworkz.tom.dto.ApplicationInfoDto;

import java.util.List;

public interface ApplicationInfoRepository {
    List<ApplicationInfoDto> findAll();
}
