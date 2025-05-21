package com.xworkz.honey.repository;

import com.xworkz.honey.dto.ProductDto;

public interface ProductRepository {
    boolean persist(ProductDto productDto);
}
