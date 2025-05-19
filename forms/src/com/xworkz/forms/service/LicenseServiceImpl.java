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
        return true;
    }
}
