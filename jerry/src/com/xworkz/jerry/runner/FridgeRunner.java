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

        System.out.println("Fridge brand list which capacity is less than 150 litres");
        for (FridgeDTO fridgeDTO : fridgeDTOS) {
            if (fridgeDTO.getCapacityInLiters() < 150) {
                System.out.println(fridgeDTO.getBrand());
            }
        }

        System.out.println("======================");

        Iterator<FridgeDTO> iterator = fridgeDTOS.iterator();
        while (iterator.hasNext()) {
            FridgeDTO fridgeDTO = iterator.next();
            System.out.println(fridgeDTO);
        }

    }

}
