package com.xworkz.rose.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
public class DriverDTO {

    private String name;
    private String licenseNumber;
    private int experience;
    private VehicleDTO vehicleDTO;

}
