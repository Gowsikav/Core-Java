package com.xworkz.tom.runner;

import com.xworkz.tom.dto.ProductDto;
import com.xworkz.tom.dto.VendorDto;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ProductVendorRunner {
    public static void main(String[] args) {

        ProductDto productDto1 = new ProductDto("Laptop", "Electronics", 1200, "L123", 201);
        ProductDto productDto2 = new ProductDto("Smartphone", "Electronics", 800, "S456", 202);
        ProductDto productDto3 = new ProductDto("Tablet", "Electronics", 500, "T789", 203);
        ProductDto productDto4 = new ProductDto("Headphones", "Accessories", 150, "H321", 204);
        ProductDto productDto5 = new ProductDto("Smartwatch", "Wearables", 250, "W654", 205);
        ProductDto productDto6 = new ProductDto("Camera", "Electronics", 1000, "C987", 206);
        ProductDto productDto7 = new ProductDto("Keyboard", "Accessories", 80, "K741", 207);
        ProductDto productDto8 = new ProductDto("Mouse", "Accessories", 40, "M852", 208);
        ProductDto productDto9 = new ProductDto("Monitor", "Electronics", 300, "MO963", 209);
        ProductDto productDto10 = new ProductDto("Printer", "Electronics", 200, "P147", 210);
        ProductDto productDto11 = new ProductDto("Speakers", "Accessories", 120, "SP258", 211);
        ProductDto productDto12 = new ProductDto("Router", "Networking", 90, "R369", 212);
        ProductDto productDto13 = new ProductDto("Webcam", "Electronics", 75, "WC159", 213);
        ProductDto productDto14 = new ProductDto("External HDD", "Storage", 110, "EH753", 214);
        ProductDto productDto15 = new ProductDto("SSD", "Storage", 130, "S963", 215);
        ProductDto productDto16 = new ProductDto("Graphics Card", "Electronics", 400, "GC852", 216);
        ProductDto productDto17 = new ProductDto("Processor", "Electronics", 350, "PR741", 217);
        ProductDto productDto18 = new ProductDto("RAM", "Hardware", 100, "RA654", 218);
        ProductDto productDto19 = new ProductDto("Motherboard", "Hardware", 220, "MB321", 219);
        ProductDto productDto20 = new ProductDto("Power Supply", "Hardware", 95, "PS987", 220);
        ProductDto productDto21 = new ProductDto("Gaming Chair", "Furniture", 180, "GC456", 221);
        ProductDto productDto22 = new ProductDto("Desk", "Furniture", 210, "D741", 222);
        ProductDto productDto23 = new ProductDto("Projector", "Electronics", 550, "PJ963", 223);
        ProductDto productDto24 = new ProductDto("Microphone", "Accessories", 140, "MI258", 224);
        ProductDto productDto25 = new ProductDto("VR Headset", "Gaming", 600, "VR369", 225);

        VendorDto vendorDto1 = new VendorDto("TechVendor", "GST123", LocalDate.of(2017, 10, 24));
        VendorDto vendorDto2 = new VendorDto("SmartSupplies", "GST124", LocalDate.of(2018, 1, 15));
        VendorDto vendorDto3 = new VendorDto("ElectroWorld", "GST125", LocalDate.of(2016, 5, 9));
        VendorDto vendorDto4 = new VendorDto("GadgetHouse", "GST126", LocalDate.of(2019, 3, 30));
        VendorDto vendorDto5 = new VendorDto("MegaStore", "GST127", LocalDate.of(2020, 7, 21));
        VendorDto vendorDto6 = new VendorDto("AlphaTech", "GST128", LocalDate.of(2021, 2, 14));
        VendorDto vendorDto7 = new VendorDto("DigitalZone", "GST129", LocalDate.of(2015, 11, 2));
        VendorDto vendorDto8 = new VendorDto("NextGenElectronics", "GST130", LocalDate.of(2014, 9, 10));
        VendorDto vendorDto9 = new VendorDto("PrimeHardware", "GST131", LocalDate.of(2018, 12, 5));
        VendorDto vendorDto10 = new VendorDto("CityTech", "GST132", LocalDate.of(2022, 6, 1));
        VendorDto vendorDto11 = new VendorDto("UrbanGizmos", "GST133", LocalDate.of(2017, 4, 18));
        VendorDto vendorDto12 = new VendorDto("OmniVendors", "GST134", LocalDate.of(2016, 8, 27));
        VendorDto vendorDto13 = new VendorDto("NovaElectro", "GST135", LocalDate.of(2019, 10, 19));
        VendorDto vendorDto14 = new VendorDto("ConnectTech", "GST136", LocalDate.of(2020, 5, 11));
        VendorDto vendorDto15 = new VendorDto("TrendyTech", "GST137", LocalDate.of(2021, 3, 3));
        VendorDto vendorDto16 = new VendorDto("ElectraMart", "GST138", LocalDate.of(2015, 7, 22));
        VendorDto vendorDto17 = new VendorDto("NeoSuppliers", "GST139", LocalDate.of(2018, 11, 13));
        VendorDto vendorDto18 = new VendorDto("InfoCore", "GST140", LocalDate.of(2016, 6, 8));
        VendorDto vendorDto19 = new VendorDto("BitStore", "GST141", LocalDate.of(2019, 2, 25));
        VendorDto vendorDto20 = new VendorDto("GearBase", "GST142", LocalDate.of(2017, 9, 17));
        VendorDto vendorDto21 = new VendorDto("HexaTech", "GST143", LocalDate.of(2014, 10, 6));
        VendorDto vendorDto22 = new VendorDto("CircuitZone", "GST144", LocalDate.of(2015, 12, 28));
        VendorDto vendorDto23 = new VendorDto("VendorSphere", "GST145", LocalDate.of(2020, 1, 9));
        VendorDto vendorDto24 = new VendorDto("GlobalGears", "GST146", LocalDate.of(2021, 8, 5));
        VendorDto vendorDto25 = new VendorDto("InfinityVendors", "GST147", LocalDate.of(2022, 4, 20));

        Map<ProductDto,VendorDto> map=new HashMap<>();

        map.put(productDto1,vendorDto1);
        map.put(productDto2,vendorDto2);
        map.put(productDto3,vendorDto3);
        map.put(productDto4,vendorDto4);
        map.put(productDto5,vendorDto5);
        map.put(productDto6,vendorDto6);
        map.put(productDto7,vendorDto7);
        map.put(productDto8,vendorDto8);
        map.put(productDto9,vendorDto9);
        map.put(productDto10,vendorDto10);
        map.put(productDto11,vendorDto11);
        map.put(productDto12,vendorDto12);
        map.put(productDto13,vendorDto13);
        map.put(productDto14,vendorDto14);
        map.put(productDto15,vendorDto15);
        map.put(productDto16,vendorDto16);
        map.put(productDto17,vendorDto17);
        map.put(productDto18,vendorDto18);
        map.put(productDto19,vendorDto19);
        map.put(productDto20,vendorDto20);
        map.put(productDto21,vendorDto21);
        map.put(productDto22,vendorDto22);
        map.put(productDto23,vendorDto23);
        map.put(productDto24,vendorDto24);
        map.put(productDto25,vendorDto25);

        System.out.println("Keys");
        map.keySet().forEach(System.out::println);
        System.out.println("Values");
        map.values().forEach(System.out::println);

        System.out.println("Entries");
        Set<Map.Entry<ProductDto,VendorDto>> entrySet=map.entrySet();
        entrySet.forEach(e->{
            ProductDto productDto=e.getKey();
            VendorDto vendorDto=e.getValue();
            System.out.println(productDto);
            System.out.println(vendorDto);
        });
    }
}
