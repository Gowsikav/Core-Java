package com.xworkz.jerry.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class FurnitureDto {
    private String brand;
    private String material;
    private double price;
    private String shape;
    private String color;

}
