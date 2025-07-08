package com.xworkz.tom.dto;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@ToString
@AllArgsConstructor
public class VendorDto {
    private String name;
    private String gstNo;
    private LocalDate establishedDate;

}
