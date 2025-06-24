package com.xworkz.jerry.runner;

import com.xworkz.jerry.dto.SareeDto;
import com.xworkz.jerry.repository.SareeRepository;
import com.xworkz.jerry.repository.SareeRepositoryImpl;

import java.util.Collection;
import java.util.Iterator;

public class SareeRunner {
    public static void main(String[] args) {

        SareeRepository sareeRepository=new SareeRepositoryImpl();
        Collection<SareeDto> sareeDtoCollection=sareeRepository.findAll();

        System.out.println("Saree type and price list which color is black:");
        for(SareeDto saree:sareeDtoCollection)
        {
            if(saree.getColor().equalsIgnoreCase("black")) {
                System.out.println("OccasionalType: " + saree.getOccasionType());
                System.out.println("Price: " + saree.getPrice());
            }
        }

        System.out.println("==============================");
        Iterator<SareeDto> iterator=sareeDtoCollection.iterator();
        while(iterator.hasNext())
        {
            SareeDto saree =iterator.next();
            System.out.println("OccasionalType: "+saree.getOccasionType());
            System.out.println("Colour: "+saree.getColor());
            System.out.println("Price: "+saree.getPrice());
            System.out.println("Material: "+saree.getMaterial());
            System.out.println("=================================");
        }

    }

}
