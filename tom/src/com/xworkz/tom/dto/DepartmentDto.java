package com.xworkz.tom.dto;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.Objects;

@ToString
@AllArgsConstructor
public class DepartmentDto {
    private int departmentId;
    private String location;

    @Override
    public boolean equals(Object o) {
        if (o != null) {
            if (o instanceof DepartmentDto) {
                DepartmentDto casted = (DepartmentDto) o;
                return this.departmentId == casted.departmentId;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(departmentId);
    }
}
