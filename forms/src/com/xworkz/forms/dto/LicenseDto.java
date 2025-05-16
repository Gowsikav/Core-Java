package com.xworkz.forms.dto;

public class LicenseDto {
    public LicenseDto()
    {
        System.out.println("LicenseDto Constructor");
    }
    private String licenseNumber;
    private String name;
    private String type;
    private String issuedDate;
    private String expiryDate;

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(String issuedDate) {
        this.issuedDate = issuedDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "LicenseDto{" +
                "licenseNumber='" + licenseNumber + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", issuedDate='" + issuedDate + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                '}';
    }
}
