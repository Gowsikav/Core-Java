package com.xworkz.jerry.repository;

import com.xworkz.jerry.dto.FanDto;

import java.util.ArrayList;
import java.util.Collection;

public class FanRepositoryImpl implements FanRepository{

      public FanRepositoryImpl()
      {
          System.out.println("FanRepository implementation constructor");
      }
    @Override
    public Collection<FanDto> findAll() {
        System.out.println("findAll method in FanRepository implementation");

        FanDto fanDto1=new FanDto("Bajaj",3,1200,48,"White");
        FanDto fanDto2=new FanDto("Havells",5,1800,36,"Black");
        FanDto fanDto3=new FanDto("Crompton",4,2500,48,"Brown");
        FanDto fanDto4=new FanDto("Orient Electric",4,2000,56,"Red");
        FanDto fanDto5=new FanDto("Usha",3,1500,36,"Purple");
        FanDto fanDto6=new FanDto("BPL",3,1000,47,"Blue");
        FanDto fanDto7=new FanDto("MARC Bonita",3,1500,47,"Violet");
        FanDto fanDto8=new FanDto("Atomberg Erica Nuvo",4,3000,60,"Blue");
        FanDto fanDto9=new FanDto("Hindware Recio",3,1600,47,"Yellow");
        FanDto fanDto10=new FanDto("Candes Lynx",4,1900,48,"Gray");

        Collection<FanDto> collection=new ArrayList<>();
        collection.add(fanDto1);
        collection.add(fanDto2);
        collection.add(fanDto3);
        collection.add(fanDto4);
        collection.add(fanDto5);
        collection.add(fanDto6);
        collection.add(fanDto7);
        collection.add(fanDto8);
        collection.add(fanDto9);
        collection.add(fanDto10);

        return collection;
    }
}
