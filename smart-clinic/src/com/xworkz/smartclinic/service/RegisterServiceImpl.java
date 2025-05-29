package com.xworkz.smartclinic.service;

import com.xworkz.smartclinic.dto.RegisterDto;
import com.xworkz.smartclinic.repository.RegisterRepository;

public class RegisterServiceImpl implements RegisterService{

    RegisterRepository registerRepository;
    public RegisterServiceImpl(RegisterRepository registerRepository) {
        this.registerRepository=registerRepository;
        System.out.println("Register Service Implementation constructor");
    }

    @Override
    public boolean save(RegisterDto registerDto) {
        System.out.println("Save method in Register service Implementation");

        if(registerDto==null)
        {
            System.err.println("Register dto is null");
            return false;
        }
        else {
            System.out.println("Register dto is not null");
        }
        String fullName=registerDto.getFullName();
        if(fullName!=null && fullName.length()>=3 && fullName.length()<=20)
        {
            System.out.println("Valid Full Name");
        }
        else {
            System.err.println("Invalid Full Name");
            return false;
        }
        String date=registerDto.getDate();
        if(date!=null && !date.isEmpty()) {
            System.out.println("Valid Date of Birth");
        }
        else {
            System.err.println("Invalid Date of Birth");
            return false;
        }
        long phoneNumber= registerDto.getPhoneNumber();
        if(phoneNumber>0)
        {
            System.out.println("Valid Phone Number");
        }
        else {
            System.err.println("Invalid Phone Number");
            return false;
        }
        String password=registerDto.getPassword();
        if(password!=null && !password.isEmpty())
        {
            System.out.println("Valid Password");
        }
        else {
            System.err.println("Invalid Password");
            return false;
        }
        String confirmPassword=registerDto.getConfirmPassword();
        if(confirmPassword!=null && !confirmPassword.isEmpty())
        {
            System.out.println("Valid Confirm Password");
        }
        else {
            System.err.println("Invalid Confirm Password");
            return false;
        }
        if(password.equals(confirmPassword))
        {
            System.out.println("Password is equal");
        }
        else {
            System.err.println("Password is not equal");
            return false;
        }
        String email=registerDto.getEmail();
        if(email!=null && !email.isEmpty())
        {
            System.out.println("Valid Email");
        }
        else {
            System.err.println("Invalid Email");
            return false;
        }
        String address=registerDto.getAddress();
        if(address!=null && address.length()>=3 && address.length()<=30)
        {
            System.out.println("Valid Address");
        }
        else {
            System.err.println("Invalid Address");
            return false;
        }
        return registerRepository.persist(registerDto);
    }
}
