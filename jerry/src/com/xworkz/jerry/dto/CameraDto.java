package com.xworkz.jerry.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class CameraDto {

    private String brand;
    private double price;
    private double resolution;
    private boolean hasWifi;
    private String fileFormat;
}
