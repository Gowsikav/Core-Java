package com.xworkz.jerry.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
@ToString
public class ProductDto implements Comparable<ProductDto>{

    private int id;
    private String productName;
    private String type;
    private LocalDate manufacturedDate;
    private String manufacturer;
    private double costPerItem;
    private int discount;
    private int quantity;
    private float warrantyInYears;

    @Override
    public int compareTo(ProductDto o) {
        return Integer.compare(this.id,o.id);
    }
}
