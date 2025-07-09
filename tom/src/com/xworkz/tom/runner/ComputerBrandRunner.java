package com.xworkz.tom.runner;

import com.xworkz.tom.dto.BrandDto;
import com.xworkz.tom.dto.ComputerDto;

import java.util.HashMap;
import java.util.Map;

public class ComputerBrandRunner {
    public static void main(String[] args) {

        ComputerDto computerDto1 = new ComputerDto(101, "i7", 16, true);
        ComputerDto computerDto2 = new ComputerDto(102, "i5", 8, false);
        ComputerDto computerDto3 = new ComputerDto(103, "i3", 4, false);
        ComputerDto computerDto4 = new ComputerDto(104, "Ryzen 5", 16, true);
        ComputerDto computerDto5 = new ComputerDto(105, "Ryzen 7", 32, true);
        ComputerDto computerDto6 = new ComputerDto(106, "i9", 64, true);
        ComputerDto computerDto7 = new ComputerDto(107, "i5", 16, false);
        ComputerDto computerDto8 = new ComputerDto(108, "i3", 8, false);
        ComputerDto computerDto9 = new ComputerDto(109, "Ryzen 3", 4, false);
        ComputerDto computerDto10 = new ComputerDto(110, "Ryzen 9", 32, true);
        ComputerDto computerDto11 = new ComputerDto(111, "i7", 8, true);
        ComputerDto computerDto12 = new ComputerDto(112, "i5", 16, true);
        ComputerDto computerDto13 = new ComputerDto(113, "i9", 32, true);
        ComputerDto computerDto14 = new ComputerDto(114, "Ryzen 5", 8, false);
        ComputerDto computerDto15 = new ComputerDto(115, "i3", 4, false);
        ComputerDto computerDto16 = new ComputerDto(116, "i7", 16, true);
        ComputerDto computerDto17 = new ComputerDto(117, "Ryzen 7", 16, true);
        ComputerDto computerDto18 = new ComputerDto(118, "i9", 64, true);
        ComputerDto computerDto19 = new ComputerDto(119, "i5", 8, false);
        ComputerDto computerDto20 = new ComputerDto(120, "Ryzen 3", 8, false);
        ComputerDto computerDto21 = new ComputerDto(121, "i7", 32, true);
        ComputerDto computerDto22 = new ComputerDto(122, "i3", 8, false);
        ComputerDto computerDto23 = new ComputerDto(123, "Ryzen 9", 64, true);
        ComputerDto computerDto24 = new ComputerDto(124, "i5", 4, false);
        ComputerDto computerDto25 = new ComputerDto(125, "Ryzen 5", 16, true);


        BrandDto brandDto1 = new BrandDto("Dell", "USA", "Michael", 1984);
        BrandDto brandDto2 = new BrandDto("HP", "USA", "Bill", 1939);
        BrandDto brandDto3 = new BrandDto("Lenovo", "China", "Liu", 1984);
        BrandDto brandDto4 = new BrandDto("Apple", "USA", "Steve", 1976);
        BrandDto brandDto5 = new BrandDto("Asus", "Taiwan", "Jonney", 1989);
        BrandDto brandDto6 = new BrandDto("Acer", "Taiwan", "Stan", 1976);
        BrandDto brandDto7 = new BrandDto("Samsung", "South Korea", "Lee", 1938);
        BrandDto brandDto8 = new BrandDto("Sony", "Japan", "Masaru", 1946);
        BrandDto brandDto9 = new BrandDto("MSI", "Taiwan", "Joseph", 1986);
        BrandDto brandDto10 = new BrandDto("Toshiba", "Japan", "Tanaka", 1875);
        BrandDto brandDto11 = new BrandDto("LG", "South Korea", "Koo", 1958);
        BrandDto brandDto12 = new BrandDto("Microsoft", "USA", "Gates", 1975);
        BrandDto brandDto13 = new BrandDto("IBM", "USA", "Watson", 1911);
        BrandDto brandDto14 = new BrandDto("Razer", "USA", "Min", 2005);
        BrandDto brandDto15 = new BrandDto("Huawei", "China", "Ren", 1987);
        BrandDto brandDto16 = new BrandDto("Alienware", "USA", "Frank", 1996);
        BrandDto brandDto17 = new BrandDto("Compaq", "USA", "Rod", 1982);
        BrandDto brandDto18 = new BrandDto("Panasonic", "Japan", "Konosuke", 1918);
        BrandDto brandDto19 = new BrandDto("Fujitsu", "Japan", "Takeshi", 1935);
        BrandDto brandDto20 = new BrandDto("Gateway", "USA", "Ted", 1985);
        BrandDto brandDto21 = new BrandDto("Sharp", "Japan", "Tokuji", 1912);
        BrandDto brandDto22 = new BrandDto("Xiaomi", "China", "Lei", 2010);
        BrandDto brandDto23 = new BrandDto("Zebronics", "India", "Rajesh", 1997);
        BrandDto brandDto24 = new BrandDto("iBall", "India", "Sandeep", 2001);
        BrandDto brandDto25 = new BrandDto("HCL", "India", "Shiv", 1976);

        Map<ComputerDto,BrandDto> map=new HashMap<>();
        map.put(computerDto1,brandDto1);
        map.put(computerDto2,brandDto2);
        map.put(computerDto3,brandDto3);
        map.put(computerDto4,brandDto4);
        map.put(computerDto5,brandDto5);
        map.put(computerDto6,brandDto6);
        map.put(computerDto7,brandDto7);
        map.put(computerDto8,brandDto8);
        map.put(computerDto9,brandDto9);
        map.put(computerDto10,brandDto10);
        map.put(computerDto11,brandDto11);
        map.put(computerDto12,brandDto12);
        map.put(computerDto13,brandDto13);
        map.put(computerDto14,brandDto14);
        map.put(computerDto15,brandDto15);
        map.put(computerDto16,brandDto16);
        map.put(computerDto17,brandDto17);
        map.put(computerDto18,brandDto18);
        map.put(computerDto19,brandDto19);
        map.put(computerDto20,brandDto20);
        map.put(computerDto21,brandDto21);
        map.put(computerDto22,brandDto22);
        map.put(computerDto23,brandDto23);
        map.put(computerDto24,brandDto24);
        map.put(computerDto25,brandDto25);

        System.out.println("Keys");
        map.keySet().forEach(System.out::println);
        System.out.println("Values");
        map.values().forEach(System.out::println);

    }
}
