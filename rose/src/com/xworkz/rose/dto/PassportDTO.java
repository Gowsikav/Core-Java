package com.xworkz.rose.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

@ToString
@AllArgsConstructor
@Getter
public class PassportDTO {

    private String number;
    private LocalDate issueDate;
    private LocalDate expiryDate;
    private CountryDTO countryDTO;

}
