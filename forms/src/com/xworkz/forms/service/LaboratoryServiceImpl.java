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

        if (laboratoryDto != null) {
            System.out.println("LaboratoryDto is not null");
        }
        else {
            System.err.println("LaboratoryDto is null");
            return false;
        }

       String labName = laboratoryDto.getLabName();
        if (labName != null && labName.length() >= 3 && labName.length() <= 50) {
            System.out.println("Valid Lab Name");
        } else {
            System.err.println("Invalid Lab Name");
            return false;
        }
        String technicianName = laboratoryDto.getTechnicianName();
        if (technicianName != null && technicianName.length() >= 3 && technicianName.length() <= 30) {
            System.out.println("Valid Technician Name");
        } else {
            System.err.println("Invalid Technician Name");
            return false;
        }
        String testName = laboratoryDto.getTestName();
        if (testName != null && testName.length() >= 3 && testName.length() <= 40) {
            System.out.println("Valid Test Name");
        } else {
            System.err.println("Invalid Test Name");
            return false;
        }

        String testDate = laboratoryDto.getTestDate();
        if (testDate != null && !testDate.isEmpty()) {
            System.out.println("Valid Test Date");
        } else {
            System.err.println("Invalid Test Date");
            return false;
        }

        String results = laboratoryDto.getResult();
        if (results != null && results.length() >= 5 && results.length() <= 500) {
            System.out.println("Valid Results");
        } else {
            System.err.println("Invalid Results");
            return false;
        }

        return true;
    }
}
