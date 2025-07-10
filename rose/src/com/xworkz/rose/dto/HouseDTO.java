package com.xworkz.rose.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
public class HouseDTO {

    private String address;
    private int rooms;
    private boolean isOwned;
    private SecurityDTO securityDTO;
}
