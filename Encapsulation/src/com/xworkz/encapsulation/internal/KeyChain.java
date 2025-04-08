package com.xworkz.encapsulation.internal;

public class KeyChain
{
    private String material;
    private int keyCount;
    private String brand;
    private boolean customized;
    private double price;

    public KeyChain() {
        System.out.println("KeyChain Constructor");
    }

    public String getMaterial() {
        return material;
    }

    void setMaterial(String material) {
        this.material = material;
    }

    public int getKeyCount() {
        return keyCount;
    }

    void setKeyCount(int keyCount) {
        this.keyCount = keyCount;
    }

    public String getBrand() {
        return brand;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isCustomized() {
        return customized;
    }

    void setCustomized(boolean customized) {
        this.customized = customized;
    }

    public double getPrice() {
        return price;
    }

    void setPrice(double price) {
        this.price = price;
    }
}
