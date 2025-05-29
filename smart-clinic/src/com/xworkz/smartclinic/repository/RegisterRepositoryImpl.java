package com.xworkz.smartclinic.repository;

import com.xworkz.smartclinic.dto.RegisterDto;

public class RegisterRepositoryImpl implements RegisterRepository{
    public RegisterRepositoryImpl() {
        System.out.println("Register Repository Implementation Constructor");
    }

    @Override
    public boolean persist(RegisterDto registerDto) {
        System.out.println("persist method in Register Repository implementation");
        return true;
    }
}
