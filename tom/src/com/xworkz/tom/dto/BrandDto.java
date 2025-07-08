package com.xworkz.tom.dto;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class BrandDto {
    private String name;
    private String country;
    private String ceo;
    private int foundedYear;
}
