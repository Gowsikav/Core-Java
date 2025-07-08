package com.xworkz.tom.dto;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.Objects;

@AllArgsConstructor
@ToString
public class ProductDto {
    private String name;
    private String type;
    private double price;
    private String modelNo;
    private int id;

    @Override
    public boolean equals(Object o) {
        if (o!=null)
        {
            if(o instanceof ProductDto)
            {
                ProductDto casted=(ProductDto) o;
                return this.id== casted.id;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
