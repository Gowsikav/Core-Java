package com.xworkz.product.repository;

import com.xworkz.product.dto.ProductDto;

public interface ProductRepository {
    boolean persist(ProductDto productDto);
}
