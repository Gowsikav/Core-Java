package com.xworkz.jerry.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class CampingAccessoryDto {

    private String accessoryName;
    private double weight;
    private boolean isWaterProof;
    private String category;
    private boolean portable;
}
