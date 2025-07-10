package com.xworkz.rose.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
public class CEODTO {

    private String name;
    private int age;
    private double netWorth;
    private HouseDTO houseDTO;
}
