package com.xworkz.rose.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
public class DetailDTO {

    private int id;
    private String description;
    private boolean isActive;
    private EducationDTO educationDTO;
}
