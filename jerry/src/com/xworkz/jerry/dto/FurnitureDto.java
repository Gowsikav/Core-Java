package com.xworkz.jerry.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class FurnitureDto {
    private String brand;
    private String material;
    private double price;
    private String shape;
    private String color;

}
