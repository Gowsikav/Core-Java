package com.xworkz.rose.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Arrays;

@AllArgsConstructor
@ToString
@Getter
public class SweetDTO implements Comparable<SweetDTO>{

    private String name;
    private double price;
    private String[] ingredients;
    private int quantity;
    private int pack;

    @Override
    public boolean equals(Object o) {
        if(o != null)
        {
            if(o instanceof SweetDTO)
            {
                SweetDTO casted = (SweetDTO) o;
                return Arrays.equals(this.ingredients, casted.ingredients);
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(ingredients);
    }

    @Override
    public int compareTo(SweetDTO o) {
        return Double.compare(this.price,o.price);
    }
}
