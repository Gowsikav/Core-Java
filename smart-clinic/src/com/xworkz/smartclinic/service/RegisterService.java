package com.xworkz.smartclinic.service;

import com.xworkz.smartclinic.dto.RegisterDto;

public interface RegisterService {
    boolean save(RegisterDto registerDto);
}
