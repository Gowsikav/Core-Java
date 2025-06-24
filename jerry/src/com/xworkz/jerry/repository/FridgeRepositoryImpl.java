package com.xworkz.jerry.repository;

import com.xworkz.jerry.dto.FridgeDTO;

import java.util.ArrayList;
import java.util.Collection;

public class FridgeRepositoryImpl implements  FridgeRepository{
    public FridgeRepositoryImpl()
    {
        System.out.println("Fridge Repository implementation constructor");
    }
    @Override
    public Collection<FridgeDTO> findAll() {
        System.out.println("findAll method in Fridge Repository implementation");

        FridgeDTO fridgeDTO1=new FridgeDTO("LG","Single Door",200);
        FridgeDTO fridgeDTO2=new FridgeDTO("Samsung","Double Door",300);
        FridgeDTO fridgeDTO3=new FridgeDTO("Haier","Top freezer",200);
        FridgeDTO fridgeDTO4=new FridgeDTO("Bosch","bottom freezer",100);
        FridgeDTO fridgeDTO5=new FridgeDTO("Whirlpool","side by side",480);

        Collection<FridgeDTO> collection=new ArrayList<>();
        collection.add(fridgeDTO1);
        collection.add(fridgeDTO5);
        collection.add(fridgeDTO4);
        collection.add(fridgeDTO2);
        collection.add(fridgeDTO3);

        return collection;
    }
}
