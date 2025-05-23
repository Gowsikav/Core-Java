package com.xworkz.dog.service;

import com.xworkz.dog.dto.RoomBookingDto;
import com.xworkz.dog.repository.RoomBookingRepository;
import com.xworkz.dog.repository.RoomBookingRepositoryImpl;

public class RoomBookingServiceImpl implements RoomBookingService{
    public RoomBookingServiceImpl()
    {
        System.out.println("Room booking service implementation constructor");
    }

    @Override
    public boolean save(RoomBookingDto roomBookingDto) {
        System.out.println("save method in Room booking service implementation");

        if(roomBookingDto==null)
        {
            System.err.println("Room booking dto is null");
            return false;
        }
        else {
            System.out.println("Room booking dto is not null");
        }
        String hotelName= roomBookingDto.getHotelName();
        if(hotelName!=null && hotelName.length()>=3 && hotelName.length()<=20)
        {
            System.out.println("Valid Hotel Name");
        }
        else {
            System.err.println("Invalid Hotel Name");
            return false;
        }
        String roomType=roomBookingDto.getRoomType();
        if(roomType==null || !roomType.isEmpty())
        {
            System.err.println("InValid Room Type");
            return false;
        }
        else {
            System.out.println("Valid Room Type");
        }
        int numberOfDays=roomBookingDto.getNumberOfDays();
        if(numberOfDays>=1 && numberOfDays<=30)
        {
            System.out.println("Valid Number of Days");
        }
        else {
            System.err.println("Invalid Number of Days");
            return false;
        }
        String arrivalDate=roomBookingDto.getArrivalDate();
        if(arrivalDate!=null &&!arrivalDate.isEmpty())
        {
            System.out.println("Valid Arrival Date");
        }
        else {
            System.err.println("Invalid Arrival Date");
            return false;
        }
        String checkOutDate=roomBookingDto.getCheckOutDate();
        if(checkOutDate!=null &&!checkOutDate.isEmpty())
        {
            System.out.println("Valid Checkout Date");
        }
        else {
            System.err.println("Invalid Checkout Date");
            return false;
        }
        System.out.println("All fields are valid");
        RoomBookingRepository roomBookingRepository=new RoomBookingRepositoryImpl();
        return roomBookingRepository.persist(roomBookingDto);
    }
}

