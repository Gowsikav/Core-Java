package com.xworkz.dog.repository;

import com.xworkz.dog.dto.RoomBookingDto;

public interface RoomBookingRepository {
    boolean persist(RoomBookingDto roomBookingDto);
}

