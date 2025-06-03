package com.xworkz.product.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProductDto {
    public ProductDto() {
        System.out.println("ProductDto Constructor");
    }
    private int productID;
    private String productName;
    private int quantity;
    private double price;
    private String category;
}
