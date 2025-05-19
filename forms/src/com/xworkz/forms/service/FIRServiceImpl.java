package com.xworkz.forms.service;

import com.xworkz.forms.dto.FIRDto;

public class FIRServiceImpl implements FIRService{
    public FIRServiceImpl(){
        System.out.println("FIR service implementation constructor");
    }

    @Override
    public boolean save(FIRDto firDto) {
        System.out.println("save method in FIR service Implementation");
        return true;
    }
}
