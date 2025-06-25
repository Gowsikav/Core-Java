package com.xworkz.jerry.runner;

import com.xworkz.jerry.dto.SareeDto;
import com.xworkz.jerry.repository.SareeRepository;
import com.xworkz.jerry.repository.SareeRepositoryImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SareeRunner {
    public static void main(String[] args) {

        SareeRepository sareeRepository=new SareeRepositoryImpl();
        Collection<SareeDto> sareeDtoCollection=sareeRepository.findAll();

        for(SareeDto saree:sareeDtoCollection)
        {
            System.out.println("OccasionalType: "+saree.getOccasionType());
            System.out.println("Colour: "+saree.getColor());
            System.out.println("Price: "+saree.getPrice());
            System.out.println("Material: "+saree.getMaterial());
            System.out.println("=================================");

        }

        System.out.println("size: "+sareeDtoCollection.size());
        Iterator<SareeDto> iterator=sareeDtoCollection.iterator();
        while(iterator.hasNext())
        {
            SareeDto saree =iterator.next();
            if(saree.getColor().equalsIgnoreCase("black")) {
                iterator.remove();
                System.out.println("Removed dto: "+saree);
            }
        }

        System.out.println("After remove size: "+sareeDtoCollection.size());

        SareeDto sareeDto=new SareeDto("Party", "Red", 4000, "Satin");
        System.out.println("Contains "+sareeDto+": "+sareeDtoCollection.contains(sareeDto));

        Collection<SareeDto> extraList=new ArrayList<>();
        SareeDto sareeDto1=new SareeDto("Farewell", "Brown", 5300, "Denim");
        SareeDto sareeDto2= new SareeDto("Daily wear", "Orange", 1570, "Silk");
        extraList.add(sareeDto1);
        extraList.add(sareeDto2);

        System.out.println("Added addAll extraList : "+sareeDtoCollection.addAll(extraList));
        System.out.println("Size: "+sareeDtoCollection.size());

        System.out.println("ContainsAll extraList: "+sareeDtoCollection.containsAll(extraList));

        System.out.println("RemoveAll extraList in collection: "+sareeDtoCollection.removeAll(extraList));

        System.out.println("Size: "+sareeDtoCollection.size());
        System.out.println("Is Empty: "+sareeDtoCollection.isEmpty());

    }

}
