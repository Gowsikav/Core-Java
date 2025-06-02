package com.xworkz.honey.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class ProductDto {
    public ProductDto()
    {
        System.out.println("ProductDto constructor");
    }
    private String productName;
    private String type;
    private double incomingPrice;
    private double sellingPrice;
    private double marketPrice;
    private String description;
    private String brand;
    private int quantity;
    private String color;
    private double weight;
    private String manufacturingDate;
    private String warranty;
    private String returnPolicy;


}
