package com.xworkz.dog.repository;

import com.xworkz.dog.dto.RoomBookingDto;

public class RoomBookingRepositoryImpl implements RoomBookingRepository{
    public RoomBookingRepositoryImpl()
    {
        System.out.println("Room BookingRepository implementation constructor");
    }

    @Override
    public boolean persist(RoomBookingDto roomBookingDto) {
        System.out.println("persist method in Room BookingRepository implementation");
        return true;
    }
}
