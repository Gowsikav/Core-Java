package com.xworkz.rose.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
public class SecurityDTO {

    private String level;
    private boolean armed;
    private String badgeId;
    private JobDTO jobDTO;
}
