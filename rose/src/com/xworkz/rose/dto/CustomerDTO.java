package com.xworkz.rose.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
public class CustomerDTO {

    private String name;
    private int age;
    private String email;
    private PassportDTO passportDTO;
}
