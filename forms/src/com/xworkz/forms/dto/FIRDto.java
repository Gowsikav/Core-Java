package com.xworkz.forms.dto;

public class FIRDto {
    public FIRDto()
    {
        System.out.println("FIRDto constructor");
    }
    private String firNumber;
    private String firDate;
    private String policeStation;
    private String complainantName;
    private String details;

    public String getFirNumber() {
        return firNumber;
    }

    public void setFirNumber(String firNumber) {
        this.firNumber = firNumber;
    }

    public String getFirDate() {
        return firDate;
    }

    public void setFirDate(String firDate) {
        this.firDate = firDate;
    }

    public String getPoliceStation() {
        return policeStation;
    }

    public void setPoliceStation(String policeStation) {
        this.policeStation = policeStation;
    }

    public String getComplainantName() {
        return complainantName;
    }

    public void setComplainantName(String complainantName) {
        this.complainantName = complainantName;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "FIRDto{" +
                "firNumber='" + firNumber + '\'' +
                ", firDate='" + firDate + '\'' +
                ", policeStation='" + policeStation + '\'' +
                ", complainantName='" + complainantName + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
