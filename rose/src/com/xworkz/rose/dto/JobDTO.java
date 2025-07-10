package com.xworkz.rose.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
public class JobDTO {

    private String role;
    private String department;
    private double salary;
    private DetailDTO detailDTO;
}
