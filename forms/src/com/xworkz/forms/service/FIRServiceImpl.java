package com.xworkz.forms.service;

import com.xworkz.forms.dto.FIRDto;

public class FIRServiceImpl implements FIRService{
    public FIRServiceImpl(){
        System.out.println("FIR service implementation constructor");
    }

    @Override
    public boolean save(FIRDto firDto) {
        System.out.println("save method in FIR service Implementation");

        if (firDto != null) {
            System.out.println("FirDto is not null");
        }
        else {
            System.err.println("FirDto is null");
            return false;
        }

        String firNumber = firDto.getFirNumber();
        if (firNumber != null && firNumber.length() >= 5 && firNumber.length() <= 15) {
            System.out.println("Valid FIR Number");
        } else {
            System.err.println("Invalid FIR Number");
            return false;
        }

        String firDate = firDto.getFirDate();
        if (firDate != null && !firDate.isEmpty()) {
            System.out.println("Valid FIR Date");
        } else {
            System.err.println("Invalid FIR Date");
            return false;
        }
        String policeStation = firDto.getPoliceStation();
        if (policeStation != null && policeStation.length() >= 3 && policeStation.length() <= 50) {
            System.out.println("Valid Police Station");
        } else {
            System.err.println("Invalid Police Station");
            return false;
        }

        String complainantName = firDto.getComplainantName();
        if (complainantName != null && complainantName.length() >= 3 && complainantName.length() <= 30) {
            System.out.println("Valid Complainant Name");
        } else {
            System.err.println("Invalid Complainant Name");
            return false;
        }

        String incidentDetails = firDto.getDetails();
        if (incidentDetails != null && incidentDetails.length() >=3 && incidentDetails.length() <= 500) {
            System.out.println("Valid Incident Details");
        } else {
            System.err.println("Invalid Incident Details");
            return false;
        }
        return true;
    }
}
