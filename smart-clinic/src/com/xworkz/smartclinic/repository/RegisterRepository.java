package com.xworkz.smartclinic.repository;

import com.xworkz.smartclinic.dto.RegisterDto;

public interface RegisterRepository {
    boolean persist(RegisterDto registerDto);
}
