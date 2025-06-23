package com.xworkz.jerry.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class ApplianceDto {

    private String name;
    private String brand;
    private double price;
    private boolean isElectric;
    private String category;
}
