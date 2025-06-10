package com.xworkz.parade.repository;

import com.xworkz.parade.dto.StampedeCaseDto;

public interface StampedeCaseRepository {
    String persist(StampedeCaseDto stampedeCaseDto);
}
