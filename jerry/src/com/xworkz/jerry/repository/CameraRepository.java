package com.xworkz.jerry.repository;

import com.xworkz.jerry.dto.CameraDto;

import java.util.Collection;

public interface CameraRepository {
    Collection<CameraDto> findAll();
}
