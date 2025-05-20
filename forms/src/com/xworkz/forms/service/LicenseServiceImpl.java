package com.xworkz.forms.service;

import com.xworkz.forms.dto.LicenseDto;

public class LicenseServiceImpl implements LicenseService{
    public LicenseServiceImpl()
    {
        System.out.println("LicenseService implementation constructor");
    }

    @Override
    public boolean save(LicenseDto licenseDto) {
        System.out.println("save method in License service implementation");

        if (licenseDto != null) {
            System.out.println("LicenseDto is not null");
        }
        else {
            System.err.println("LicenseDto is null");
            return false;
        }

        String licenseNumber = licenseDto.getLicenseNumber();
        if (licenseNumber != null && licenseNumber.length() >= 6 && licenseNumber.length() <= 20) {
            System.out.println("Valid License Number");
        } else {
            System.err.println("Invalid License Number");
            return false;
        }

        String licenseHolder = licenseDto.getName();
        if (licenseHolder != null && licenseHolder.length() >= 3 && licenseHolder.length() <= 30) {
            System.out.println("Valid License Holder");
        } else {
            System.err.println("Invalid License Holder");
            return false;
        }
        String licenseType = licenseDto.getType();
        if (licenseType != null && licenseType.length() >= 3 && licenseType.length() <= 30) {
            System.out.println("Valid License Type");
        } else {
            System.err.println("Invalid License Type");
            return false;
        }
        String issuedDate = licenseDto.getIssuedDate();
        if (issuedDate != null && !issuedDate.isEmpty()) {
            System.out.println("Valid Issued Date");
        } else {
            System.err.println("Invalid Issued Date");
            return false;
        }

        String expiryDate = licenseDto.getExpiryDate();
        if (expiryDate != null && !expiryDate.isEmpty()) {
            System.out.println("Valid Expiry Date");
        } else {
            System.err.println("Invalid Expiry Date");
            return false;
        }

        return true;
    }
}
