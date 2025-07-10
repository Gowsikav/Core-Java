package com.xworkz.rose.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
public class CompanyDTO {

    private String name;
    private String industry;
    private int employeeCount;
    private CEODTO ceodto;
}
