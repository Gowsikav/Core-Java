package com.xworkz.jerry.runner;


import com.xworkz.jerry.dto.FridgeDTO;
import com.xworkz.jerry.repository.FridgeRepository;
import com.xworkz.jerry.repository.FridgeRepositoryImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class FridgeRunner {


    public static void main(String[] args) {

        FridgeRepository fridgeRepository = new FridgeRepositoryImpl();
        Collection<FridgeDTO> fridgeDTOS = fridgeRepository.findAll();

        System.out.println("Total size :" + fridgeDTOS.size());


        Iterator<FridgeDTO> iterator = fridgeDTOS.iterator();
        while (iterator.hasNext()) {
            FridgeDTO fridgeDTO = iterator.next();
            if(fridgeDTO.getBrand().equalsIgnoreCase("LG"))
            {
                iterator.remove();
                System.out.println("Removed :"+fridgeDTO);
            }
        }
        System.out.println("dto after removal:");
        for (FridgeDTO fridgeDTO : fridgeDTOS) {
            System.out.println(fridgeDTO);
        }
        System.out.println("======================");

        FridgeDTO fridgeDTO=new FridgeDTO("Haier","Top freezer",100);
        System.out.println("Contains "+fridgeDTO+": "+ fridgeDTOS.contains(fridgeDTO));

        Collection<FridgeDTO> extraList =new ArrayList<>();
        FridgeDTO fridgeDTO1=new FridgeDTO("Samsung","bottom freezer",150);
        FridgeDTO fridgeDTO2=new FridgeDTO("Sony","side by side",380);
        extraList.add(fridgeDTO1);
        extraList.add(fridgeDTO2);

        System.out.println("Added extraList using addAll: "+fridgeDTOS.addAll(extraList));

        System.out.println("size after add: "+fridgeDTOS.size());

        System.out.println("Contains ExtraList: "+fridgeDTOS.containsAll(extraList));
        System.out.println("RemoveAll extraList in collection: "+fridgeDTOS.removeAll(extraList));
        System.out.println("size after removesAll: "+fridgeDTOS.size());

        System.out.println("Is empty: "+fridgeDTOS.isEmpty());

    }

}
