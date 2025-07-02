package com.xworkz.jerry.runner;

import com.xworkz.jerry.dto.ProductDto;
import com.xworkz.jerry.repository.ProductRepository;
import com.xworkz.jerry.repository.ProductRepositoryImpl;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ProductRunner {
    public static void main(String[] args) {

        ProductRepository productRepository=new ProductRepositoryImpl();
        Collection<ProductDto> collection=productRepository.findAll();

        System.out.println("All Product Information");
        collection.forEach(System.out::println);

        System.out.println("=========================");
        System.out.println("Product name list");
        collection.forEach(productdto->System.out.println(productdto.getProductName()));

        System.out.println("=========================");
        System.out.println("Product list which have discount greater than 10%");
        collection.stream().filter(productDto -> productDto.getDiscount()>10).forEach(System.out::println);

        System.out.println("=========================");
        System.out.println("Product list which have warranty less than 3");
        Collection<ProductDto> warrantyList=collection.stream().filter(productDto -> productDto.getWarrantyInYears()<3).collect(Collectors.toList());
        warrantyList.forEach(System.out::println);

        System.out.println("===========================");
        System.out.println("sorted by id in ascending order");
        collection.stream().sorted().forEach(System.out::println);

        System.out.println("===========================");
        System.out.println("Product list contains which are quantity > 5 and sort by id");
        Collection<ProductDto> quantityList=collection.stream().filter(productDto -> productDto.getQuantity()>5).collect(Collectors.toList());
        quantityList.forEach(System.out::println);

        System.out.println("==========================");
        System.out.println("Manufacturer from all products");
        Collection<String> manufacturerList=collection.stream().map(ProductDto::getManufacturer).collect(Collectors.toList());
        manufacturerList.forEach(System.out::println);

        System.out.println("============================");
        System.out.println("Product with minimum discount");
        int minDiscount = collection.stream().mapToInt(ProductDto::getDiscount).min().orElse(0);
        collection.stream().filter(productDto -> productDto.getDiscount() == minDiscount).forEach(System.out::println);

        System.out.println("===============================");
        System.out.println("Product with latest manufacturedDate");
        LocalDate latestManufacturedDate= collection.stream().map(ProductDto::getManufacturedDate).max(Comparator.naturalOrder()).get();
        collection.stream().filter(productDto -> productDto.getManufacturedDate().equals(latestManufacturedDate)).forEach(System.out::println);

        System.out.println("==============================");
        System.out.println("Product with Maximum costPerItem");
        double maxCost = collection.stream().mapToDouble(ProductDto::getCostPerItem).max().orElse(0.0);
        collection.stream().filter(productDto -> productDto.getCostPerItem()==maxCost).forEach(System.out::println);

    }
}
