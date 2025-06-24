package com.xworkz.jerry.runner;

import com.xworkz.jerry.dto.ApplianceDto;
import com.xworkz.jerry.repository.ApplianceRepository;
import com.xworkz.jerry.repository.ApplianceRepositoryImpl;

import java.util.Collection;
import java.util.Iterator;

public class ApplianceRunner {

    public static void main(String[] args) {

        ApplianceRepository applianceRepository=new ApplianceRepositoryImpl();
        Collection<ApplianceDto> collection=applianceRepository.findAll();

        System.out.println("Electric Appliance List:");
        for(ApplianceDto applianceDto:collection)
        {
            if(applianceDto.isElectric()) {
                System.out.println("Appliance name: " + applianceDto.getName());
                System.out.println("Brand: " + applianceDto.getBrand());

            }
        }
        System.out.println("======================================");
        Iterator<ApplianceDto> iterator= collection.iterator();
        while(iterator.hasNext())
        {
            ApplianceDto applianceDto=iterator.next();
            System.out.println("Appliance name: "+applianceDto.getName());
            System.out.println("Brand: "+applianceDto.getBrand());
            System.out.println("Price: "+applianceDto.getPrice());
            System.out.println("IsElectric: "+applianceDto.isElectric());
            System.out.println("Category: "+applianceDto.getCategory());
            System.out.println("======================================");
        }
    }
}
