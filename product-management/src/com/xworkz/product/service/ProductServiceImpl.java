package com.xworkz.product.service;

import com.xworkz.product.dto.ProductDto;
import com.xworkz.product.exception.*;
import com.xworkz.product.repository.ProductRepository;
import com.xworkz.product.repository.ProductRepositoryImpl;

public class ProductServiceImpl implements ProductService{
    public ProductServiceImpl() {
        System.out.println("Product service implementation constructor");
    }

    @Override
    public boolean save(ProductDto productDto) {
        System.out.println("save method in product service implementation");

        if(productDto!=null)
        {
            System.out.println("ProductDto is not null");
        }
        else {
            System.out.println("ProductDto is null");
            return false;
        }
        int productId= productDto.getProductID();
        if(productId<0)
        {
           throw new ProductIDCheck("Product ID is less than 0");
        }
        else {
            System.out.println("Product ID is valid");
        }
        String productName= productDto.getProductName();
        if(productName == null || productName.length() < 3)
        {
            throw new ProductNameNullCheck("Product Name is empty");
        }
        else {
            System.out.println("Product Name is valid");
        }
        int quantity= productDto.getQuantity();
        if(quantity<0 || quantity>1000)
        {
            throw new QuantityCheck("Quantity is not valid");
        }
        else {
            System.out.println("Quantity is valid");
        }
        double price = productDto.getPrice();
        if(price>0 && price<10000)
        {
            System.out.println("Price is valid");
        }
        else {
            throw new PriceCheck("Price is not in the valid limit");
        }
        String category= productDto.getCategory();
        if(category.equals("Electronics") || category.equals("Books") || category.equals("Clothing") || category.equals("Home"))
        {
            System.out.println("Category is valid");
        }
        else {
            throw new CategoryCheck("Category is not selected correctly");
        }

        ProductRepository productRepository=new ProductRepositoryImpl();
        return productRepository.persist(productDto);
    }
}
