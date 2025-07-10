package com.xworkz.rose.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
public class EducationDTO {

    private String degree;
    private String university;
    private int graduationYear;
    private double gpa;

}
