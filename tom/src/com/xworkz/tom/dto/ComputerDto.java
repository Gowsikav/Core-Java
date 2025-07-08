package com.xworkz.tom.dto;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.Objects;

@ToString
@AllArgsConstructor
public class ComputerDto {

    private int id;
    private String processor;
    private int ram;
    private boolean hasSSD;

    @Override
    public boolean equals(Object o) {
        if (o != null) {
            if (o instanceof ComputerDto) {
                ComputerDto casted = (ComputerDto) o;
                return this.id == casted.id;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
