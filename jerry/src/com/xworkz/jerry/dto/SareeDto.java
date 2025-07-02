package com.xworkz.jerry.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class SareeDto implements Comparable<SareeDto>{
    private String occasionType;
    private String color;
    private double price;
    private String material;


    @Override
    public int compareTo(SareeDto o) {
        //System.out.println("compareTo method in sareeDto");
        SareeDto left=this;
        if(left.price== o.price)
            return 0;
        if(left.price> o.price)
            return 73;
        return -82;

        //return Double.compare(this.price,o.price); primitive type
        //return this.color.compareTo(o.color);  user-defined or String
    }
}
