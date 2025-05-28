package com.xworkz.smartclinic.dto;

public class AppointmentDto {
    public AppointmentDto()
    {
        System.out.println("Appointment Dto constructor");
    }
    private String patientName;
    private String date;
    private String timeSlot;
    private String doctorName;

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeslot) {
        this.timeSlot = timeslot;
    }

    @Override
    public String toString() {
        return "appointmentDto{" +
                "patientName='" + patientName + '\'' +
                ", date='" + date + '\'' +
                ", timeSlot='" + timeSlot + '\'' +
                ", doctorName='" + doctorName + '\'' +
                '}';
    }
}
