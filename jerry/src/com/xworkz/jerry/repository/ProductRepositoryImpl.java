package com.xworkz.jerry.repository;

import com.xworkz.jerry.dto.ProductDto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class ProductRepositoryImpl implements ProductRepository{
    public ProductRepositoryImpl()
    {
        System.out.println("ProductRepository implementation constructor");
    }

    @Override
    public Collection<ProductDto> findAll() {
        System.out.println("findAll method in ProductRepository implementation");

        ProductDto productDto1=new ProductDto(1,"Nikon D850 Camera","Electronics", LocalDate.of(2022,3,18),"Nikon",29380,20,2,2.6f);
        ProductDto productDto2=new ProductDto(2,"HP OmniBook 5 QC","Electronics", LocalDate.of(2021,7,28),"HP",75650,15,1,2);
        ProductDto productDto3=new ProductDto(3,"Xiaomi Pad 7","Electronics", LocalDate.of(2025,2,10),"Xiaomi",26999,23,4,1);
        ProductDto productDto4=new ProductDto(4,"Clap box Adjustable Snare Cajon","Musical Instrument", LocalDate.of(2020,10,27),"Clap box",4498,69,7,0.6f);
        ProductDto productDto5=new ProductDto(5,"Storm Football","Ball", LocalDate.of(2002,8,3),"Nivia",329,55,10,2.6f);
        ProductDto productDto6=new ProductDto(6,"Trekking Shoes","Sports", LocalDate.of(2019,11,9),"BoldFit",1999,50,3,1);
        ProductDto productDto7=new ProductDto(7,"Football Goalkeeper Gloves","Sports", LocalDate.of(2003,7,10),"Proberos",739,45,4,0.5f);
        ProductDto productDto8=new ProductDto(8,"Stabilizer","Home & Kitchen", LocalDate.of(2021,7,8),"V-Guard",3196,24,3,3);
        ProductDto productDto9=new ProductDto(9,"DC Plug Cable","Electronics", LocalDate.of(2021,6,12),"Fedus",328,34,15,0.6f);
        ProductDto productDto10=new ProductDto(10,"Adapter for TP-Link Router","Computer Accessories", LocalDate.of(2008,4,29),"7 seven",314,37,3,1);
        ProductDto productDto11=new ProductDto(11,"Treadmill","Fitness", LocalDate.of(2002,4,13),"FitKit",29999,63,1,3);
        ProductDto productDto12=new ProductDto(12,"Smart LED TV","Electronics", LocalDate.of(2020,12,16),"Skywall",7299,68,8,0.10f);
        ProductDto productDto13=new ProductDto(13,"Wall Screws","Industrial", LocalDate.of(1998,9,20),"Phillips",499,50,6,0.5f);
        ProductDto productDto14=new ProductDto(14,"Wardrobe","Furniture", LocalDate.of(2001,4,19),"Wooden street",15799,19,1,1);
        ProductDto productDto15=new ProductDto(15,"Brave New World","Books", LocalDate.of(2004,2,9),"Aldous Huxley",325,35,2,5);
        ProductDto productDto16=new ProductDto(16,"Security camera","Electronics", LocalDate.of(2010,8,17),"Tapo",1699,53,8,1);
        ProductDto productDto17=new ProductDto(17,"Cabinet","Furniture", LocalDate.of(2020,11,17),"Bluewud",5629,41,1,3.5f);
        ProductDto productDto18=new ProductDto(18,"Apple pot plant","Artificial plants", LocalDate.of(2019,10,8),"fancymart",300,68,4,0.10f);
        ProductDto productDto19=new ProductDto(19,"Weight Machine","Home & Kitchen", LocalDate.of(2006,10,15),"Glun",204,77,2,0.8f);
        ProductDto productDto20=new ProductDto(20,"Catch-22","Books", LocalDate.of(2021,4,19),"Joseph Heller",350,30,5,5);
        ProductDto productDto21=new ProductDto(21,"Wrist Watch","Watches", LocalDate.of(2016,10,15),"IIK",499,67,1,3);
        ProductDto productDto22=new ProductDto(22,"Washing Machine","Home & Kitchen", LocalDate.of(2023,12,17),"Stylista",435,56,1,0.6f);
        ProductDto productDto23=new ProductDto(23,"Water Bottle","Kitchen", LocalDate.of(2024,6,29),"Milton",967,18,2,0.4f);
        ProductDto productDto24=new ProductDto(24,"Lipstick","Beauty", LocalDate.of(2023,9,17),"Blue Heaven",178,1,5,0.2f);
        ProductDto productDto25=new ProductDto(25,"Sofa","Furniture", LocalDate.of(2021,4,12),"Sleepyhead",17099,28,1,2);
        ProductDto productDto26=new ProductDto(26,"Refrigerator","Home & Kitchen", LocalDate.of(2025,1,30),"Samsung",38990,32,1,1);
        ProductDto productDto27=new ProductDto(27,"Sneakers","Shoes", LocalDate.of(2022,7,2),"Skethers",1800,55,4,0.6f);
        ProductDto productDto28=new ProductDto(28,"Helmet","Motorbike accessories", LocalDate.of(2022,3,18),"Vega Atom",738,16,1,1.3f);
        ProductDto productDto29=new ProductDto(29,"Training Bag","Bags", LocalDate.of(2017,12,21),"MuscleBlaze",699,46,3,0.10f);
        ProductDto productDto30=new ProductDto(30,"Adult Watch","Watches", LocalDate.of(2023,11,12),"Fastrack",895,8,2,1.5f);
        ProductDto productDto31=new ProductDto(31,"Realme 13 pro 5G","Electronics", LocalDate.of(2020,5,14),"Realme",19999,31,3,1);
        ProductDto productDto32=new ProductDto(32,"1984","Books", LocalDate.of(2019,5,1),"George Orwell",132,34,7,6);
        ProductDto productDto33=new ProductDto(33,"Refrigerator","Home & Kitchen", LocalDate.of(2021,7,8),"Goorej",32090,68,1,3);
        ProductDto productDto34=new ProductDto(34,"Nothing Phone (2a) plus","Electronics", LocalDate.of(2018,7,16),"Nothing",21899,27,1,1.4f);
        ProductDto productDto35=new ProductDto(35,"UV protection Glass","Health & personal Care", LocalDate.of(2021,9,2),"Enak Eye",1000,5,3,1.5f);
        ProductDto productDto36=new ProductDto(36,"Clog","Shoes", LocalDate.of(2021,6,29),"Crocs",3557,35,3,0.5f);
        ProductDto productDto37=new ProductDto(37,"Liquid lip colour","Beauty", LocalDate.of(2023,8,28),"Lakme",244,30,5,0.3f);
        ProductDto productDto38=new ProductDto(38,"Washing Machine","Home & Kitchen", LocalDate.of(2016,5,19),"LG",38990,28,1,2);
        ProductDto productDto39=new ProductDto(39,"AC","Home & Kitchen", LocalDate.of(2012,9,8),"Godrej",37990,31,1,1.5f);
        ProductDto productDto40=new ProductDto(40,"Meditations","Books", LocalDate.of(2017,8,10),"Marcus Aurelius",119,40,3,5);
        ProductDto productDto41=new ProductDto(41,"Mini Bamboo bunch","Artificial plants", LocalDate.of(2023,2,4),"fancyMart",299,67,8,0.5f);
        ProductDto productDto42=new ProductDto(42,"Duffle Bag","Bags", LocalDate.of(2012,1,25),"MuscleBlaze",1099,33,1,1);
        ProductDto productDto43=new ProductDto(43,"Women Watch","Watches", LocalDate.of(2024,8,15),"Titan",1682,16,1,1);
        ProductDto productDto44=new ProductDto(44,"Glasses","Health & personal Care", LocalDate.of(2025,2,28),"Lenskart Blu",799,77,2,1);


        Collection<ProductDto> collection=new ArrayList<>();
        collection.add(productDto7);
        collection.add(productDto12);
        collection.add(productDto1);
        collection.add(productDto2);
        collection.add(productDto3);
        collection.add(productDto9);
        collection.add(productDto28);
        collection.add(productDto29);
        collection.add(productDto39);
        collection.add(productDto40);
        collection.add(productDto8);
        collection.add(productDto41);
        collection.add(productDto5);
        collection.add(productDto32);
        collection.add(productDto33);
        collection.add(productDto6);
        collection.add(productDto4);
        collection.add(productDto36);
        collection.add(productDto37);
        collection.add(productDto38);
        collection.add(productDto30);
        collection.add(productDto33);
        collection.add(productDto10);
        collection.add(productDto11);
        collection.add(productDto19);
        collection.add(productDto26);
        collection.add(productDto20);
        collection.add(productDto24);
        collection.add(productDto25);
        collection.add(productDto21);
        collection.add(productDto13);
        collection.add(productDto15);
        collection.add(productDto28);
        collection.add(productDto29);
        collection.add(productDto30);
        collection.add(productDto31);
        collection.add(productDto16);
        collection.add(productDto14);
        collection.add(productDto22);
        collection.add(productDto23);
        collection.add(productDto27);
        collection.add(productDto34);
        collection.add(productDto35);
        collection.add(productDto42);
        collection.add(productDto43);
        collection.add(productDto17);
        collection.add(productDto18);
        collection.add(productDto44);


        return collection;
    }
}
