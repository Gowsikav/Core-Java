package com.xworkz.guessnumber.service;

import com.xworkz.guessnumber.dto.NumberDto;

public interface NumberService {
    boolean validate(NumberDto numberDto);
}
