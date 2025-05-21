package com.xworkz.honey.dto;

public class ProductDto {
    public ProductDto()
    {
        System.out.println("ProductDto constructor");
    }
    private String productName;
    private String type;
    private double incomingPrice;
    private double sellingPrice;
    private double marketPrice;
    private String description;
    private String brand;
    private int quantity;
    private String color;
    private double weight;
    private String manufacturingDate;
    private String warranty;
    private String returnPolicy;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getIncomingPrice() {
        return incomingPrice;
    }

    public void setIncomingPrice(double incomingPrice) {
        this.incomingPrice = incomingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(double marketPrice) {
        this.marketPrice = marketPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(String manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public String getReturnPolicy() {
        return returnPolicy;
    }

    public void setReturnPolicy(String returnPolicy) {
        this.returnPolicy = returnPolicy;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return "ProductDto{" +
                "productName='" + productName + '\'' +
                ", type='" + type + '\'' +
                ", incomingPrice='" + incomingPrice + '\'' +
                ", sellingPrice='" + sellingPrice + '\'' +
                ", marketPrice='" + marketPrice + '\'' +
                ", description='" + description + '\'' +
                ", brand='" + brand + '\'' +
                ", quantity='" + quantity + '\'' +
                ", color='" + color + '\'' +
                ", weight='" + weight + '\'' +
                ", manufacturingDate='" + manufacturingDate + '\'' +
                ", warranty='" + warranty + '\'' +
                ", returnPolicy='" + returnPolicy + '\'' +
                '}';
    }
}
