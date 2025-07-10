package com.xworkz.rose.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
public class CountryDTO {

    private String name;
    private String continent;
    private String currency;
    private PresidentDTO presidentDTO;
}
