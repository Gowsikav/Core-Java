package com.xworkz.jerry.repository;

import com.xworkz.jerry.dto.ProductDto;

import java.util.Collection;

public interface ProductRepository {
    Collection<ProductDto> findAll();
}
