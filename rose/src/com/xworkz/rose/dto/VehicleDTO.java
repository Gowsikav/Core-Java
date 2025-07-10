package com.xworkz.rose.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
public class VehicleDTO {

    private String brand;
    private String model;
    private int year;
    private CompanyDTO companyDTO;
}
