package com.xworkz.forms.dto;

public class LaboratoryDto {
    public LaboratoryDto()
    {
        System.out.println("LaboratoryDto Constructor");
    }
    private String labName;
    private String technicianName;
    private String testName;
    private String testDate;
    private String result;

    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public String getTechnicianName() {
        return technicianName;
    }

    public void setTechnicianName(String technicianName) {
        this.technicianName = technicianName;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getTestDate() {
        return testDate;
    }

    public void setTestDate(String testDate) {
        this.testDate = testDate;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "LaboratoryDto{" +
                "labName='" + labName + '\'' +
                ", technicianName='" + technicianName + '\'' +
                ", testName='" + testName + '\'' +
                ", testDate='" + testDate + '\'' +
                ", result='" + result + '\'' +
                '}';
    }
}
