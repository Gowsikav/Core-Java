package com.xworkz.tom.dto;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.Objects;

@ToString
@AllArgsConstructor
public class UniversityDto {

    private String name;
    private String location;
    private int establishedYear;
    private int worldRanking;

    @Override
    public boolean equals(Object o) {
        if (o !=null)
        {
            if (o instanceof UniversityDto)
            {
                UniversityDto casted=(UniversityDto) o;
                return this.name.equals(casted.name);
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
