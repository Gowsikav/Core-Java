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
        if(donationDto!=null)
        {
            System.out.println("DonationDto not null");
        }
        else {
            System.err.println("DonationDto is null");
            return false;
        }
        String firstName=donationDto.getFirstName();
        if(firstName!=null && firstName.length()>=3 && firstName.length()<=20)
        {
            System.out.println("Valid firstName");
        }
        else {
            System.err.println("Invalid first Name");
            return false;
        }
       String lastName= donationDto.getLastName();
        if(lastName!=null && !lastName.isEmpty() && lastName.length()<=20)
        {
            System.out.println("Valid LastName");
        }
        else {
            System.err.println("Invalid LstName");
            return false;
        }

        String email=donationDto.getEmail();
        if(email!=null && email.length()>=10 && email.length()<=40)
        {
            System.out.println("Valid Email");
        }
        else {
            System.err.println("Invalid email");
            return false;
        }
        String amountStr=donationDto.getAmount();
        if(amountStr!=null) {
            double amount =Double.parseDouble(amountStr);
            if(amount>1) {
                System.out.println("Valid amount");
            }
            else {
                System.err.println("Invalid amount");
                return false;
            }
        }
        else {
            System.err.println("Invalid amount");
            return false;
        }
        String cause =donationDto.getCause();
        if(cause!=null && cause.length()>=3 && cause.length()<=100)
        {
            System.out.println("Valid cause");
        }
        else {
            System.err.println("Invalid cause");
            return false;
        }

        return true;
    }
}
