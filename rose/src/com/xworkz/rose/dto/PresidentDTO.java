package com.xworkz.rose.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
public class PresidentDTO {

    private String name;
    private int termYears;
    private int age;
    private DriverDTO driverDTO;
}
