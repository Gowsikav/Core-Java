package com.xworkz.forms.service;

import com.xworkz.forms.dto.DonationDto;

public class DonationServiceImpl implements DonationService{
    public DonationServiceImpl()
    {
        System.out.println("Donation service Implementation constructor");
    }

    @Override
    public boolean save(DonationDto donationDto) {
        System.out.println("Save method in donation service implementation");
        return true;
    }
}
