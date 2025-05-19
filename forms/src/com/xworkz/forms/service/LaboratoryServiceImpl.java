package com.xworkz.forms.service;

import com.xworkz.forms.dto.LaboratoryDto;

public class LaboratoryServiceImpl implements LaboratoryService{
    public LaboratoryServiceImpl()
    {
        System.out.println("Laboratory service implementation constructor");
    }

    @Override
    public boolean save(LaboratoryDto laboratoryDto) {
        System.out.println("save method in Laboratory service implementation");
        return true;
    }
}
