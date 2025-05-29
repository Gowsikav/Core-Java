package com.xworkz.smartclinic.service;

import com.xworkz.smartclinic.dto.AppointmentDto;
import com.xworkz.smartclinic.repository.AppointmentRepository;

import java.util.Objects;

public class AppointmentServiceImpl implements AppointmentService{
    AppointmentRepository appointmentRepository;
    public AppointmentServiceImpl(AppointmentRepository appointmentRepository)
    {
        System.out.println("AppointmentServiceImpl constructor");
        this.appointmentRepository=appointmentRepository;
    }

    @Override
    public boolean save(AppointmentDto appointmentDto) {
        System.out.println("Save method in AppointmentService implementation");

        if(Objects.isNull(appointmentDto))
        {
            System.err.println("AppointmentDto is null");
            return false;
        }
        else {
            System.out.println("AppointmentDto is not null");
        }
        String patientName= appointmentDto.getPatientName();
        if(patientName!=null && patientName.length()>=3 && patientName.length()<=20)
        {
            System.out.println("Valid Patient Name");
        }
        else {
            System.err.println("Invalid Patient Name");
            return false;
        }
        String date= appointmentDto.getDate();
        if(!date.isEmpty())
        {
            System.out.println("Valid Date");
        }
        else {
            System.err.println("Invalid date");
            return false;
        }
        String timeSlot= appointmentDto.getTimeSlot();
        if(timeSlot!=null && !timeSlot.isEmpty())
        {
            System.out.println("Valid Time Slot");
        }
        else {
            System.err.println("Invalid Time Slot");
            return false;
        }
        String doctorName= appointmentDto.getDoctorName();
        if(doctorName!=null && !doctorName.isEmpty())
        {
            System.out.println("Valid Doctor Name");
        }
        else {
            System.err.println("Invalid Doctor Name");
            return false;
        }
        return appointmentRepository.persist(appointmentDto);
    }
}
