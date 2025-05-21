package com.xworkz.honey.service;

import com.xworkz.honey.dto.ProductDto;

import javax.servlet.ServletRequest;

public class ProductServiceImpl implements ProductService{
    public ProductServiceImpl()
    {
        System.out.println("Product service implementation constructor");
    }

    @Override
    public boolean save(ProductDto productDto) {
        System.out.println("Save method in product service implementation");

        if(productDto!=null)
        {
            System.out.println("ProductDto is not null");
        }
        else {
            System.err.println("ProductDto is null");
            return false;
        }
       String productName= productDto.getProductName();
        if(productName!=null && productName.length()>=3 && productName.length()<=20)
        {
            System.out.println("Valid ProductName");
        }
        else {
            System.err.println("Invalid ProductName");
            return false;
        }
        String type=productDto.getType();
        if(type!=null && !type.isEmpty())
        {
            System.out.println("Valid Product Type");
        }
        else {
            System.err.println("Invalid Product Type");
            return false;
        }
        double incomingPrice=productDto.getIncomingPrice();
        if(incomingPrice>=10 && incomingPrice<=50000)
        {
            System.out.println("Valid Incoming Price");
        }
        else {
            System.err.println("Invalid Incoming Price");
            return false;
        }

        double sellingPrice=productDto.getSellingPrice();
        if(sellingPrice>=10 && sellingPrice<=50000)
        {
            System.out.println("Valid Selling Price");
        }
        else {
            System.err.println("Invalid Selling Price");
            return false;
        }

        double marketPrice=productDto.getMarketPrice();
        if(marketPrice>=10 && marketPrice<=50000)
        {
            System.out.println("Valid Market Price");
        }
        else {
            System.err.println("Invalid Market Price");
            return false;
        }

        String description= productDto.getDescription();
        if(description!=null && description.length()>=3 && description.length()<=100)
        {
            System.out.println("Valid Description");
        }
        else {
            System.err.println("Invalid Description");
            return false;
        }
        String brand=productDto.getBrand();
        if(brand!=null && brand.length()>=3 && brand.length()<=20)
        {
            System.out.println("Valid Brand");
        }
        else {
            System.err.println("Invalid Brand");
            return false;
        }
        int quantity=productDto.getQuantity();
        if(quantity>=1 && quantity<=10)
        {
            System.out.println("Valid Quantity");
        }
        else {
            System.err.println("Invalid Quantity");
            return false;
        }
        String color=productDto.getColor();
        if(color!=null && !color.isEmpty())
        {
            System.out.println("Valid Color");
        }
        else {
            System.err.println("Invalid Color");
            return false;
        }
        double weight=productDto.getWeight();
        if(weight>=1 && weight<=100)
        {
            System.out.println("Valid Weight");
        }
        else {
            System.err.println("Invalid Weight");
            return false;
        }
        String manufacturingDate=productDto.getManufacturingDate();
        if(manufacturingDate!=null && !manufacturingDate.isEmpty())
        {
            System.out.println("Valid Manufacturing Date");
        }
        else {
            System.err.println("Invalid Manufacturing Date");
            return false;
        }
        String warranty=productDto.getWarranty();
        if(warranty!=null && !warranty.isEmpty())
        {
            System.out.println("Valid Warranty");
        }
        else {
            System.err.println("Invalid Warranty");
            return false;
        }
        String returnPolicy=productDto.getReturnPolicy();
        if(returnPolicy!=null && !returnPolicy.isEmpty())
        {
            System.out.println("Valid ReturnPolicy");
        }
        else {
            System.err.println("Invalid ReturnPolicy");
            return false;
        }

        return true;
    }
}
