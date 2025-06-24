package com.xworkz.jerry.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@ToString
@AllArgsConstructor
public class FridgeDTO implements Serializable {

    private String brand;
    private String type;
    private int capacityInLiters;

}
