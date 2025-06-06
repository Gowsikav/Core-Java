package com.xworkz.guessnumber.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NumberDto {
    public NumberDto()
    {
        System.out.println("NumberDto constructor");
    }
    private int userNumber;
    private int randomNumber;
}
