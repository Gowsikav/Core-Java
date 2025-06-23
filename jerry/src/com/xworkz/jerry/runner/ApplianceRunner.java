package com.xworkz.jerry.runner;

import com.xworkz.jerry.dto.ApplianceDto;

import java.util.ArrayList;
import java.util.Collection;

public class ApplianceRunner {

    public static void main(String[] args) {

        ApplianceDto applianceDto1=new ApplianceDto("Refrigerator", "LG", 30000, true, "Kitchen");
        ApplianceDto applianceDto2=new ApplianceDto("Refrigerator", "LG", 3000, true, "Kitchen");
        ApplianceDto applianceDto3=new ApplianceDto("Microwave", "Samsung", 10000, true, "Kitchen");
        ApplianceDto applianceDto4=new ApplianceDto("Vacuum Cleaner", "Dyson", 25000, true, "Cleaning");
        ApplianceDto applianceDto5= new ApplianceDto("Ceiling Fan", "Havells", 4500, true, "Home");
        ApplianceDto applianceDto6 = new ApplianceDto("Dishwasher", "Bosch", 42000, true, "Kitchen");
        ApplianceDto applianceDto7 = new ApplianceDto("Gas Stove", "Prestige", 7000, false, "Kitchen");
        ApplianceDto applianceDto8 = new ApplianceDto("Washing Machine", "Whirlpool", 32000, true, "Laundry");
        ApplianceDto applianceDto9 = new ApplianceDto("Air Conditioner", "Voltas", 38000, true, "Cooling");
        ApplianceDto applianceDto10 = new ApplianceDto("Water Purifier", "Kent", 9000, true, "Health");

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

        for(ApplianceDto applianceDto:collection)
        {
            System.out.println("Appliance name: "+applianceDto.getName());
            System.out.println("Brand: "+applianceDto.getBrand());
            System.out.println("Price: "+applianceDto.getPrice());
            System.out.println("IsElectric: "+applianceDto.isElectric());
            System.out.println("Category: "+applianceDto.getCategory());
            System.out.println("======================================");
        }
    }
}
