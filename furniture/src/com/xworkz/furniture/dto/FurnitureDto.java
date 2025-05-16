package com.xworkz.furniture.dto;

public class FurnitureDto {
    private String brand;
    private String size;
    private String material;
    private String modelName;
    private String productBenefits;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getProductBenefits() {
        return productBenefits;
    }

    public void setProductBenefits(String productBenefits) {
        this.productBenefits = productBenefits;
    }

    @Override
    public String toString() {
        return "FurnitureDto{" +
                "brand='" + brand + '\'' +
                ", size='" + size + '\'' +
                ", material='" + material + '\'' +
                ", modelName='" + modelName + '\'' +
                ", productBenefits='" + productBenefits + '\'' +
                '}';
    }
}
