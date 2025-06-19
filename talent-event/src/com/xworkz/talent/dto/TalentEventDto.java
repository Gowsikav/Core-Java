package com.xworkz.talent.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class TalentEventDto {
    public TalentEventDto()
    {
        System.out.println("Talent event Dto constructor");
    }

    private String name;
    private String age;
    private long contact;
    private String talentType;
    private String description;
    private Timestamp createdAt=Timestamp.valueOf(LocalDateTime.now());
}
