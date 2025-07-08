package com.xworkz.tom.dto;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.Objects;

@ToString
@AllArgsConstructor
public class PersonDto {

    private String name;
    private String email;
    private String aadharNumber;

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
        {
            if(obj instanceof PersonDto)
            {
                PersonDto casting=(PersonDto) obj;
                return this.email.equals(casting.email);
            }
        }
        return false;
    }
}
