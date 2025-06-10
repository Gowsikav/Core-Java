package com.xworkz.parade.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class StampedeCaseDto {
    public StampedeCaseDto() {
        System.out.println("Stampede case Dto constructor");
    }

    private String event;
    private String location;
    private int deathsCount;
    private int injuriesCount;
}
