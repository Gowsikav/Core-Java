package com.xworkz.tom.dto;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class AddressDto {
    private int no;
    private  String street;
    private String city;
    private int pincode;

}
