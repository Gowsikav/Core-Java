package com.xworkz.jerry.repository;

import com.xworkz.jerry.dto.ApplianceDto;

import java.util.ArrayList;
import java.util.Collection;

public class ApplianceRepositoryImpl implements ApplianceRepository{
    public ApplianceRepositoryImpl()
    {
        System.out.println("ApplianceRepository implementation constructor");
    }

    @Override
    public Collection<ApplianceDto> findAll() {
        System.out.println("findAll method in ApplianceRepository implementation");

        ApplianceDto applianceDto1=new ApplianceDto("Refrigerator", "LG", 30000, true, "Kitchen");
        ApplianceDto applianceDto2=new ApplianceDto("Electric Stove", "Butterfly", 8000, true, "Kitchen");
        ApplianceDto applianceDto3=new ApplianceDto("Microwave", "Samsung", 10000, true, "Kitchen");
        ApplianceDto applianceDto4=new ApplianceDto("Vacuum Cleaner", "Dyson", 25000, true, "Cleaning");
        ApplianceDto applianceDto5= new ApplianceDto("Ceiling Fan", "Havells", 4500, false, "Home");
        ApplianceDto applianceDto6 = new ApplianceDto("Dishwasher", "Bosch", 42000, true, "Kitchen");
        ApplianceDto applianceDto7 = new ApplianceDto("Gas Stove", "Prestige", 7000, false, "Kitchen");
        ApplianceDto applianceDto8 = new ApplianceDto("Washing Machine", "Whirlpool", 32000, true, "Laundry");
        ApplianceDto applianceDto9 = new ApplianceDto("Air Conditioner", "Voltas", 38000, true, "Cooling");
        ApplianceDto applianceDto10 = new ApplianceDto("Water Purifier", "Kent", 9000, false, "Health");

        Collection<ApplianceDto> collection=new ArrayList<>();
        collection.add(applianceDto1);
        collection.add(applianceDto2);
        collection.add(applianceDto3);
        collection.add(applianceDto4);
        collection.add(applianceDto5);
        collection.add(applianceDto6);
        collection.add(applianceDto7);
        collection.add(applianceDto8);
        collection.add(applianceDto9);
        collection.add(applianceDto10);

        return collection;
    }
}
