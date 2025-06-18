package com.xworkz.laptop.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class LaptopDto {
    public LaptopDto()
    {
        System.out.println("Laptop Dto constructor");
    }

    private String brand;
    private String model;
    private double price;
    private boolean isAvailable;
    private String warranty;
    private LocalDate manufacturedDate;
    private Timestamp created_at= Timestamp.valueOf(LocalDateTime.now());
}
