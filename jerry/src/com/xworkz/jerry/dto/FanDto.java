package com.xworkz.jerry.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class FanDto {
    private String brand;
    private int noOfBlades;
    private double price;
    private int size;
    private String color;
}
