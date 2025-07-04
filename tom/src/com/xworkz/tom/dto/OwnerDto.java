package com.xworkz.tom.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class OwnerDto {
    private String ownerName;
    private String emailId;
    private long phoneNo;

}
