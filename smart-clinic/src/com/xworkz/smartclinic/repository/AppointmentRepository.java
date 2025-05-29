package com.xworkz.smartclinic.repository;

import com.xworkz.smartclinic.dto.AppointmentDto;

public interface AppointmentRepository {
    boolean persist(AppointmentDto appointmentDto);
}
