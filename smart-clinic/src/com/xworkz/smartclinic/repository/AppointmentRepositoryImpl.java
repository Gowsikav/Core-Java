package com.xworkz.smartclinic.repository;

import com.xworkz.smartclinic.dto.AppointmentDto;

public class AppointmentRepositoryImpl implements AppointmentRepository{
    public AppointmentRepositoryImpl()
    {
        System.out.println("Appointment Repository Implementation constructor");
    }

    @Override
    public boolean persist(AppointmentDto appointmentDto) {
        System.out.println("Persist method in appointment Repository Implementation");
        return true;
    }
}
