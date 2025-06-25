package com.xworkz.jerry.runner;


import com.xworkz.jerry.dto.FridgeDTO;
import com.xworkz.jerry.repository.FridgeRepository;
import com.xworkz.jerry.repository.FridgeRepositoryImpl;

import java.util.Collection;
import java.util.Iterator;

public class FridgeRunner {


    public static void main(String[] args) {

        FridgeRepository fridgeRepository = new FridgeRepositoryImpl();
        Collection<FridgeDTO> fridgeDTOS = fridgeRepository.findAll();

        System.out.println("Total size :" + fridgeDTOS.size());

        System.out.println("======================");

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

    }

}
