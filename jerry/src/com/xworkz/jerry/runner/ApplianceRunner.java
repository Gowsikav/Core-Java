package com.xworkz.jerry.runner;

import com.xworkz.jerry.dto.ApplianceDto;
import com.xworkz.jerry.repository.ApplianceRepository;
import com.xworkz.jerry.repository.ApplianceRepositoryImpl;

import java.util.ArrayList;
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
                //collection.remove(applianceDto); ConcurrentModificationException
            }
        }
        System.out.println("======================================");

        System.out.println("Collection size: "+collection.size());

        Iterator<ApplianceDto> iterator= collection.iterator();
        while(iterator.hasNext())
        {
            ApplianceDto applianceDto=iterator.next();
            if(applianceDto.getBrand().equalsIgnoreCase("samsung"))
            {
                System.out.println("Deleted dto: "+applianceDto);
                iterator.remove();
            }
        }
        System.out.println("Collection size after remove: "+collection.size());

        ApplianceDto testDto = new ApplianceDto("Dishwasher", "Bosch", 2000, true, "Kitchen");
        System.out.println("Contains Dishwasher: " + collection.contains(testDto));

        Collection<ApplianceDto> testList = new ArrayList<>();
        ApplianceDto applianceDto1= new ApplianceDto("Ceiling Fan", "Havells", 4500, false, "Home");
        ApplianceDto applianceDto2=new ApplianceDto("Air Conditioner", "Voltas", 38000, true, "Cooling");
        testList.add(applianceDto1);
        testList.add(applianceDto2);
        System.out.println("Contains all test appliances: " + collection.containsAll(testList));

        Collection<ApplianceDto> applianceCopy = new ArrayList<>(collection);
        boolean removed = collection.removeAll(applianceCopy);
        System.out.println("Removed all items: " + removed);

        System.out.println("Is collection empty now: " + collection.isEmpty());

        collection.addAll(testList);
        System.out.println("Re-added some appliances, size now: " + collection.size());


    }
}
