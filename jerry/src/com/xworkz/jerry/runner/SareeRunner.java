package com.xworkz.jerry.runner;

import com.xworkz.jerry.dto.SareeDto;

import java.util.ArrayList;
import java.util.Collection;

public class SareeRunner {
    public static void main(String[] args) {

        SareeDto sareeDto1=new SareeDto("Casual", "Blue", 7500, "Cotton");
        SareeDto sareeDto2=new SareeDto("Formal", "Black", 2500, "Silk");
        SareeDto sareeDto3=new SareeDto("Party", "Red", 4000, "Satin");
        SareeDto sareeDto4=new SareeDto("Bridal", "White", 10000, "Polyester");
        SareeDto sareeDto5=new SareeDto("Reception", "Yellow", 6000, "Linen");
        SareeDto sareeDto6=new SareeDto("Festival", "Gray", 2000, "Wool");
        SareeDto sareeDto7=new SareeDto("Office", "Green", 1000, "Cotton");
        SareeDto sareeDto8=new SareeDto("Wedding", "Green", 2000, "Lace");
        SareeDto sareeDto9=new SareeDto("Cocktail", "Brown", 5000, "Denim");
        SareeDto sareeDto10=new SareeDto("Daily wear", "Purple", 1500, "Silk");

        Collection<SareeDto> collection=new ArrayList<>();
        collection.add(sareeDto1);
        collection.add(sareeDto2);
        collection.add(sareeDto3);
        collection.add(sareeDto4);
        collection.add(sareeDto5);
        collection.add(sareeDto6);
        collection.add(sareeDto7);
        collection.add(sareeDto8);
        collection.add(sareeDto9);
        collection.add(sareeDto10);

        for(SareeDto saree:collection)
        {
            System.out.println("OccasionalType: "+saree.getOccasionType());
            System.out.println("Colour: "+saree.getColor());
            System.out.println("Price: "+saree.getPrice());
            System.out.println("Material: "+saree.getMaterial());
            System.out.println("=================================");
        }

    }
}
